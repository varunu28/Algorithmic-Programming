import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        out.println(isPrime(Integer.parseInt(br.readLine())) ? "Yes" : "No");
	    }
	}
	
	private static boolean isPrime(int n) {
	    if (n == 1) {
	        return false;
	    }
	    
	    int limit = (int) Math.sqrt(n);
	    for (int i=2; i<=limit; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
