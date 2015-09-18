package algorithms;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayToBST {
	
	private ArrayList<Worker> workersInRange = new ArrayList<Worker>();
 
    public Worker convert(Worker[] arr, int start, int end){
 
        if(start > end)
            return null;
 
        int mid = start + ((end - start)/2);
        Worker root = arr[mid];
        root.setLeftNode(convert(arr,start,mid-1));
        root.setRightNode(convert(arr,mid+1,end));
 
        return root;
 
    }
    
    public void findRangeElements(Worker root, long salary1, long salary2)
    {
       /* base case */
       if ( null == root )
          return;
     
       /* Recurse for left subtree if root.data is greater than k1, 
        * to get values within range from left subtree */
       if ( salary1 < root.getData() )
    	   findRangeElements(root.leftNode, salary1, salary2);
     
       /* if root's data lies in range, then prints root's data */
       if ( salary1 <= root.getData() && salary2 >= root.getData() )
         workersInRange.add(root);
     
       /* Recurse for left subtree if root.data is greater than salary1 and
        * less than salary2 get values within range from right subtree */
       if ( salary2 > root.getData() )
    	   findRangeElements(root.rightNode, salary1, salary2);
    }
 
    public static void main(String args[]){
 
    	MergeSortNodes sort = new MergeSortNodes();
    	Worker[] nodes = new Worker[15];
    	nodes[0] = new Worker(0, 8);
    	nodes[1] = new Worker(1, 2);
    	nodes[2] = new Worker(2, 25);
    	nodes[3] = new Worker(3, 10);
    	nodes[4] = new Worker(4, 28);
    	nodes[5] = new Worker(5, 55);
    	nodes[6] = new Worker(6, 60);
    	nodes[7] = new Worker(7, 0);
    	nodes[8] = new Worker(8, 15);
    	nodes[9] = new Worker(9, 4);
    	nodes[10] = new Worker(10, 3);
    	nodes[11] = new Worker(11, 77);
    	nodes[12] = new Worker(12, 90);
    	nodes[13] = new Worker(13, 18);
    	nodes[14] = new Worker(14, 44);
    	sort.sortNodes(nodes);
    	System.out.println("Sorted values Before BST:");
    	for(Worker i : nodes){
    		System.out.print(" "+i.getIndex() + "-> " +i.getData());
    	}
    	
    	System.out.println();
    	
    	ArrayToBST arrayToBtree = new ArrayToBST();
    	
    	Worker root = arrayToBtree.convert(nodes, 0, nodes.length - 1);
 
        System.out.println("BST in In order : " + root.getData() + ": " + root.getIndex());
        
        printInOrderBST(root);
        
        System.out.println();
        
        arrayToBtree.findRangeElements(root, 10, 60);
        
        for(Worker w: arrayToBtree.workersInRange){
        	System.out.println(w.getData() + ": " + w.getIndex());
        }
        
        Collections.sort(arrayToBtree.workersInRange, new WorkerComparator());
        
        for(Worker w: arrayToBtree.workersInRange){
        	System.out.println("Hi" +w.getData() + ": " + w.getIndex());
        }
 
    }

	private static void printInOrderBST(Worker root) {
		if (null == root) {
			return;
		} else {
			printInOrderBST(root.leftNode);
			System.out.print(" "+root.getIndex() + "-> " +root.getData());
			printInOrderBST(root.getRightNode());
		}
		
		
	}
	
	
 
}
