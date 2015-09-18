package arraysndstrings;


// aaa aa

public class CrackingCI {

	public boolean verifySame(String str1, String str2){
		
		if (str1.length() != str2.length()) return false;
		
		if (str1.isEmpty() && str2.isEmpty()) return true;
		
		int[] values = new int[256];
		
		for (char c: str1.toCharArray()){
			
			values[c]++;
			
		}
		
		for (char c: str2.toCharArray()) {
			
			if (--values[c] < 0) return false;
			
		}
		
		return true;
	}
	
	
	
	/* NxN matrix rotate
	
	1 2 3 4
	5 5 5 5
	5 5 5 5
	6 7 8 9
	
	*/
	
	public int[][] rotate2DArray(int[][] arr1){
		
		int len = arr1[0].length;
		
		for (int layer = 0; layer < len/2; layer++) {
			
			int first = layer;
			
			int last = len - 1 - layer;
			
			for(int i = first; i < last; i++){
				
				int offset = i - first;
			
				int temp = arr1[first][i];
			
				arr1[first][i] = arr1[last - offset][first];
			
				arr1[last - offset][first] = arr1[last][last - offset];
			
				arr1[last][last - offset] = arr1[i][last];
			
				arr1[i][last] = temp;
			
			
			}
			
		}
		
		
		return arr1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(new CrackingCI().verifySame("abc", "caa"));

	}

}
