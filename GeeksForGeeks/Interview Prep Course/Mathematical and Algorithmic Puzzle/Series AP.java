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
	        int a1 = Integer.parseInt(s[0]);
	        int a2 = Integer.parseInt(s[1]);
	        int n = Integer.parseInt(br.readLine());
	        
	        int d = a2 - a1;
	        
	        System.out.println(a1 + (n-1) * d);
	    }
	}
}
