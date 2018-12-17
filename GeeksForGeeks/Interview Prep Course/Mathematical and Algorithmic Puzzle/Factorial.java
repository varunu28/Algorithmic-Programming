import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        System.out.println(factorial(Integer.parseInt(br.readLine())));
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
