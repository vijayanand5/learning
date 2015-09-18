package algorithms;
/**
 * This class provides the implementation of selection sort algorithm
 * @author viperias
 *
 */
public class InsertionSort {

	private float[] inputArray;
	
	public InsertionSort(float[] argArray){
		this.inputArray = argArray;
	}
	
	
	public void sortAndDisplay(){
		
		int inputLength = inputArray.length;
		if(inputLength == 1){
			System.exit(0);
		} else if(inputArray != null && inputLength != 0){
			float element = 0; 
			for(int i = 1, j=0; i < inputLength; i++){
				element = inputArray[i];
				j=i;
					while(j > 0 && element < inputArray[j-1]){
						inputArray[j] = inputArray[j-1]; 
						j--;
					}
				inputArray[j] = element;
				
			}
			
			
		
		} else {
			System.out.println("Input array is not valid!");
			System.exit(0);
		}
		
if(inputArray != null && inputLength != 0){
		System.out.println("The sorted values are:");
		for(float value: inputArray){
			
			System.out.print(value + " ");
			
			}
		
		}

	}
	
	public static void main(String[] args) {
		
		float[] dataArray = {5, -2, 0, 3, 2, 1};
		
		InsertionSort selSort = new InsertionSort(dataArray);
		
		selSort.sortAndDisplay();

	}

}
