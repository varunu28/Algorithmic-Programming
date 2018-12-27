import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String[] s = br.readLine().split("\\.");
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i=s.length-1; i>=0; i--) {
	            sb.append(s[i]);
	            if (i != 0) {
	                sb.append('.');
	            }
	        }
	        
	        out.println(sb.toString());
	    }
	}
}
