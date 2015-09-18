package arraysndstrings;

public class UniqueString {
	
	private String test_val;
	
	public UniqueString(String val){
		this.test_val = val;
	}
	
	public void checkUnique(){
		
		if(test_val == null || test_val.equalsIgnoreCase("")){
			return;
		}else{
		
		boolean isNotUnique = false;
		boolean ascii[] = new boolean[128];
		
		char vals[] = test_val.toCharArray();
		
		for(char c : vals){
			if(ascii[c]){
				System.out.println("String Not unique");
				return;
			} else {
				ascii[c] = true;
			}
			
		}
		
		System.out.println("String is unique");
		
	 }
		
	}
	
	public static void main(String args[]){
		
		
		UniqueString uString = new UniqueString("abca");
		
		uString.checkUnique();
		
	}
	
	
	
}
