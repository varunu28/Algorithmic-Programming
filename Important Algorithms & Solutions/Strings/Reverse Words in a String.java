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
	        String[] strs = s.split("\\.");
	        
	        StringBuilder sb = new StringBuilder("");
	        
	        for (int i=strs.length-1;i>0;i--) {
	            sb.append(strs[i]).append(".");
	        }
	        
	        sb.append(strs[0]);
	        
	        out.println(sb.toString());
	    }
	}
}
