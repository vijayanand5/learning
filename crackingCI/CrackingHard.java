package crackingCI;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class CrackingHard {
	
	
	// 0110 
	// 0111
	// 1101
	
	// 1011
	public static int addTwoNum(int num1, int num2)	{
		if ( num2 == 0) return num1; 
		
		int result = num1 ^ num2;
		
		int carry = (num1 & num2) << 1;
		
		return addTwoNum(result, carry);
		
		
	}
	
	
	
	public static BigInteger findFactorial(BigInteger n) {
		if (n.intValue() == 0) return BigInteger.valueOf(1);
		
		return  n.multiply(findFactorial(n.subtract(BigInteger.valueOf(1))));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int newVal = in.nextInt();
		BigInteger val = CrackingHard.findFactorial(BigInteger.valueOf(newVal));
		System.out.println(val);
			//System.out.println(CrackingHard.addTwoNum(5, 4));
		
        
	}

}
