public class MergeSortn {
  private int[] numbers;
  private int[] helper;
  private Worker[] nodes;

  private int length;

  public void sort(int[] values) {
    this.numbers = values;
    length = values.length;
    this.nodes = new Worker[length];
    this.helper = new int[length];
    mergesort(0, length - 1);
    System.out.println("\n\n After Merge: ");
    for(Worker i : nodes){
		System.out.println(" "+i.getIndex() + "->   " + i.getData());
	}
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
      if (helper[i] <= helper[j]) {
        numbers[k] = helper[i];
        nodes[k] = new Worker(i, helper[i]);
        i++;
      } else {
        numbers[k] = helper[j];
        nodes[k] = new Worker(j, helper[j]);
        j++;
        
        
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      numbers[k] = helper[i];
      nodes[k] = new Worker(i, helper[i]);
      k++;
      i++;
    }
    

  }
  
  public static void main(String[] args) {
	MergeSortn sort = new MergeSortn();
	
	int arr[] = {3,2,1,-100, -150, 0};
	sort.sort(arr);
	System.out.println("Sorted values:");
	for(int i : arr){
		System.out.print(" "+i);
	}
}
  
}

