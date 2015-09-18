package linkedlists;


// aaa aa

public class CrackingCI {

	public int returnKthElem(Node node, int k){
		
		if (node.getNext() == null) return 1;
		
		
		int result = returnKthElem(node.getNext(), k) + 1;
		
		if (result == k){
			System.out.println(node);
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(new CrackingCI().verifySame("abc", "caa"));

	}

}
