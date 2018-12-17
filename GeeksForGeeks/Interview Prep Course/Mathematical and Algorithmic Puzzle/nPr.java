import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String[] s = br.readLine().split("\\s+");
	        int n = Integer.parseInt(s[0]);
	        int r = Integer.parseInt(s[1]);
	        
	        System.out.println(factorial(n) / factorial(n - r));
	    }
	}
	
	private static long factorial(int n) {
	    long fact = 1;
	    while (n > 0) {
	        fact *= n;
	        n--;
	    }
	    
	    return fact;
	}
}
