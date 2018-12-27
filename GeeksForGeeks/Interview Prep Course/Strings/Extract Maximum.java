import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String s = br.readLine();
	        char[] c = s.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        int i = 0;
	        long max = 0;
	        
	        while (i < c.length) {
	            if (Character.isDigit(c[i])) {
	                sb.append(c[i]);
	                i++;
	                
	                while (i < c.length && Character.isDigit(c[i])) {
	                    sb.append(c[i]);
	                    i++;
	                }
	                
	                max = Math.max(max, Long.parseLong(sb.toString()));
	                sb = new StringBuilder();
	            }
	            
	            i++;
	        }
	        
	        out.println(max);
	    }
	}
}
