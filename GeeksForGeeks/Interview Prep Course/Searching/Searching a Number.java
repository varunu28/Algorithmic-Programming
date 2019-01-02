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
	        String k = s[1];
	        
	        s = br.readLine().split("\\s+");
	        int idx = -1;
	        for (int i=0; i<n; i++) {
	            if (s[i].equals(k)) {
	                idx = i + 1;
	                break;
	            }
	        }
	        
	        out.println(idx);
	    }
	}
}
