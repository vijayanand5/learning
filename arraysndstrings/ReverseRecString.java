package arraysndstrings;

public class ReverseRecString {
	
	//vijay  
	public String reverseStringIter(String val){
		
		int len = val.length();
		
		char[] v = val.toCharArray();
		int i = 0;
		char temp = ' ';
		while(i < len/2 ) {
			temp = v[i];
			v[i] = v[len - i - 1];
			v[len -i -1] = temp;
			i++;	
		}
		
		return String.valueOf(v);
	}
	
	public String reverseStringRecur(String val){
		
		if( val.length() == 1) return val;
		return reverseStringRecur(val.substring(1)) + val.charAt(0);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseRecString r = new ReverseRecString();
		
		//System.out.println(r.reverseStringIter("vijay"));
		
		System.out.println(r.reverseStringRecur("vijay"));
	}

}
