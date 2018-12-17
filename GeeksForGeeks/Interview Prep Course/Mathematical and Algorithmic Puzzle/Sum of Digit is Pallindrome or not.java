import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int s = Integer.parseInt(br.readLine());
	        int digitSum = getDigitSum(s);
	        out.println(isPalindrome(String.valueOf(digitSum)) ? "YES" : "NO");
	    }
	}
	
	private static boolean isPalindrome(String s) {
	    return new StringBuilder(s).reverse().toString().equals(s);
	}
	
	private static int getDigitSum(int n) {
	    int sum = 0;
	    
	    while(n > 0) {
	        sum += n % 10;
	        n /= 10;
	    }
	    
	    return sum;
	}
}
