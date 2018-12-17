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
	        System.out.println(getReverse(s));
	    }
	}
	
	private static int getReverse(int n) {
	    int rev = 0;
	    while (n > 0) {
	        rev = rev * 10 + n % 10;
	        n /= 10;
	    }
	    
	    return rev;
	}
}
