import java.util.HashMap;
import java.util.Map;


public class CrackingModerate {
	

	static Map<String, String> valMap = new HashMap<String, String>();
	
	// 12345
	public static int revNumber(int number) {
		
		if (number == 0) return number;

			int rem = 0, prev = 0;
			while (number/10 >= 0){
				rem = number % 10;
				prev = prev*10 + rem;
				if (number/10 == 0) break;
				number /= 10;
			}
			
			return prev;
		
	}
	
	
	//To get largest sum in sequence of an array
	//2, -8, 5, -2, 4, -10
	public static int getMaxSumInSequece(int[] a){
		if (a.length == 0) return 0;
		
		int max = 0, i = 0;
		max = a[i];
		i++;
		
		while (i < a.length) {

			if (max + a[i]  >= a[i]) {
				max += a[i];
			} else {
				max= a[i];
			}
			
			
			i++;

		}

		return max;
	}
	

	public static int findMaxSumSubArray(int[] arr) {
	    
	    if (arr.length == 0) return 0;
	    
	    
	    int cur = 0, start = 0, end = 0;
	    
	    int max = Integer.MIN_VALUE;
	    
	    for (int i = 0; i < arr.length; i++) {
	    
	    	cur += arr[i];
	    	
	    	if (cur < arr[i]){
	        	start = i;
	        	cur = arr[i];
	        } 
	        
	        
	        if (cur > max){
	            max = cur;
	            end = i;
	        }
	        
	    }
	    for (; start < end; start++){
	    	System.out.println(arr[start]);
	    }
	    
	        System.out.println("Start elem: " + start);
	        System.out.println("End elem: " + end);
	    
	    return max;
	    
	    }
	
	public static int findTrailingZeros(int  n)
	{
	    // Initialize result
	    int count = 0;
	 
	    // Keep dividing n by powers of 5 and update count
	    for (int i=5; n/i >= 1; i *= 5)
	          count += n/i;
	 
	    return count;
	}
	
	
	/*<family lastName="McDowell" state="CA">
	<person firstName="Gayle">Some Message</person>
	</family>*/
	public static void printEncodedXML(String val) {
		
		if (val == null) return;
		
		char[] value = val.toCharArray();
		
		int i = 0;
		StringBuilder sb = new StringBuilder();
		
		while (i < value.length){
			
			if (value[i] == '<') {
				i++;
				
				while (value[i] != '>') {
					
					sb.append(value[i]);
					
					if (value[i+1] == ' '){
						if (sb.toString().trim().length() > 0)
							System.out.println(findElemValue(sb.toString()));
						sb.delete(0, sb.length());
						i++;
					} else if (value[i+1] == '='){
						System.out.println(findElemValue(sb.toString()));
						sb.delete(0, sb.length());
						i += 2;
					} else if (value[i+1] == '"') {
						System.out.println(sb.toString());
						sb.delete(0, sb.length());
						i += 2;
					} 
					
					i++;
				
				}
				
				i++;
				
			}
			
		}
		
	}
	
	
	static String findElemValue(String str) {
		Map<String, String> newMap = new HashMap<String, String>();
		
		newMap.put("family", "1");
		newMap.put("person", "2");
		newMap.put("firstName", "3");
		newMap.put("lastName", "4");
		newMap.put("state", "5");
		
		
		return newMap.get(str);
	}
	
	
	public static int findWordFrequency(String val, String elem){
		
		if (val == null || elem == null) return 0;
		
		char[] str = val.toCharArray();
		char[] value = elem.toCharArray();
		int i = 0, j = 0, count = 0;
		while (i < str.length) {
			if (str[i] == value[j]){
				while (j < value.length && str[i] == value[j]) {
					i++; j++;
				}
				
				if (j == value.length) count++;
				
				j = 0;
					
			} else {
				i++;
			}
		}
		
		
		return count;
	}
	

	public static void main(String[] args) {
		String val = "<family lastName=\"McDowell\" state=\"CA\">";
		System.out.println(3 & 1);
		//CrackingModerate.printEncodedXML(val);
		//System.out.println(CrackingModerate.findWordFrequency("Crackding", "rack"));
		//System.out.println(CrackingModerate.findMaxSumSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		//System.out.println(CrackingModerate.findTrailingZeros(125));
		//CrackingModerate.findAllCharCombinations("2345", "");
		//System.out.println(CrackingModerate.revNumber(543));
		//System.out.println(CrackingModerate.isTicTacToe(new int[][]{{0,1,1}, {0,1,0}, {0,1,0}}));
	}
	
	/*
	 * Print tic-tac-toe win
	 */
	public static boolean isTicTacToe(int[][] arr) {
		
		int len = arr.length, rowCount = 0, colCount = 0, diagCount = 0;
		
		for (int i = 0; i < len; i++){
			rowCount = 0; colCount = 0;
			for (int j = 0; j < len; j++){
				if (arr[i][j] == 0) rowCount++;
				else rowCount--;
				
				if (arr[j][i] == 0) colCount++;
				else colCount--; 
				
				if ( i == j) {
					if (arr[j][i] == 0) diagCount++;
					else diagCount--;
				}
				
				//if
				
			}
			if (Math.abs(rowCount) == 3 || Math.abs(colCount) == 3 || Math.abs(diagCount) == 3) return true;
		}
		
		return false;
	}
	
	/**
	 * Find all char combinations for a given number
	 * @param val
	 */
	public static void findAllCharCombinations(String val, String prefix){
		
		valMap.put("0", "xyz");
		valMap.put("1", "abc");
		valMap.put("2", "def");
		valMap.put("3", "ghi");
		valMap.put("4", "jkl");
		valMap.put("5", "mno");
		
		if (val.length() == 0) System.out.println(prefix);
		
		if (val.length() > 0){
			String currStr =  valMap.get(String.valueOf(val.charAt(0)));
			for (int i = 0 ; i < currStr.length() ; i++)
				findAllCharCombinations(val.substring(1), prefix + currStr.charAt(i) );
		}
		
	}

}
