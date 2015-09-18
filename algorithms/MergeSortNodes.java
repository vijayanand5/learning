package algorithms;
public class MergeSortNodes {
  private Worker[] numbers;
  private Worker[] helper;

  private int length;

  public void sortNodes(Worker[] values) {
    this.numbers = values;
    length = values.length;
    this.helper = new Worker[length];
    mergesort(0, length - 1);
  }

  private void mergesort(int low, int high) {
	  
    // check if low is smaller then high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
     mergesort(low, middle);
      // Sort the right side of the array
     mergesort(middle + 1, high);
      // Combine them both
     merge(low, middle, high);
    }
    
  }

  private void merge(int low, int middle, int high) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
      helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
      if (helper[i].getData() <= helper[j].getData()) {
        numbers[k] = helper[i];
        i++;
      } else {
        numbers[k] = helper[j];
        j++;
        
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  }
  
  public static void main(String[] args) {
	MergeSortNodes sort = new MergeSortNodes();
	Worker[] nodes = new Worker[15];
	nodes[0] = new Worker(0, 8);
	nodes[1] = new Worker(1, 2);
	nodes[2] = new Worker(2, 25);
	nodes[3] = new Worker(3, 1);
	nodes[4] = new Worker(4, 28);
	nodes[5] = new Worker(5, 55);
	nodes[6] = new Worker(6, 61);
	nodes[7] = new Worker(7, 0);
	nodes[8] = new Worker(8, 15);
	nodes[9] = new Worker(9, 4);
	nodes[10] = new Worker(10, 3);
	nodes[11] = new Worker(11, 77);
	nodes[12] = new Worker(12, 90);
	nodes[13] = new Worker(13, 18);
	nodes[14] = new Worker(14, 44);
	sort.sortNodes(nodes);
	System.out.println("Sorted values:");
	for(Worker i : nodes){
		System.out.println(" "+i.getIndex() + "-> " + i.getData());
	}
}
  
}

