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
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int k = Integer.parseInt(s[2]);
	        
	        long n = (long) Math.pow(a, b);
	        
	        String num = String.valueOf(n);
	        System.out.println(num.charAt(num.length() - k));
	    }
	}
}
