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
	        System.out.println(getDigitCubeSum(s) == s ? "Yes" : "No");
	    }
	}
	
	private static int getDigitCubeSum(int n) {
	    int sum = 0;
	    
	    while (n > 0) {
	        int rem = n % 10;
	        sum += rem * rem * rem;
	        n /= 10;
	    }
	    
	    return sum;
	}
}
