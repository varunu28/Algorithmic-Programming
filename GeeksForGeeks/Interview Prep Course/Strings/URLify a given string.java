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
	        char[] ch = s.toCharArray();
	        int n = Integer.parseInt(br.readLine());
	        for (char c : ch) {
	            if (c == ' ') {
	                out.print("%20");
	            }
	            else {
	                out.print(c);
	            }
	        }
	        
	        out.println();
	    }
	}
}
