
/* 1 2 3 4   1 0 2 9
   0 1 5 6   2 1 3 8
   2 3 0 4   3 5 0 1      
   9 8 1 3   4 6 4 3
*/

public class Random {
	
	public static void swapDiagElem(int[][] arr) {
		
		if (arr[0].length == 0) return;		
		int temp;
		
		for (int k = 0; k < arr.length; k ++) {			
			for (int l = 0; l <= k; l++ ) {
				temp = arr[k][l];				
				arr[k][l] = arr[l][k];					
				arr[l][k] = temp;				
			}						
		}
		
		for  (int i = 0; i < arr.length; i ++){			
			for (int j = 0 ; j < arr.length ; j ++){
				System.out.print(arr[i][j] + " ");
			}			
			System.out.println();			
		}
		
	}

	public static void main(String[] args) {
		Random.swapDiagElem(new int[][]{{1, 2, 3, 4}, { 0, 1, 5, 6}, {2, 3, 0, 4}, {9,8, 1, 3}} );
	

	}

}
