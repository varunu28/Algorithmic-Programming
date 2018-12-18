import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int n = Integer.parseInt(br.readLine());
	        String[] s = br.readLine().split("\\s+");
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        
	        for (String str : s) {
	            max = Math.max(max, Integer.parseInt(str));
	            min = Math.min(min, Integer.parseInt(str));
	        }
	        
	        out.println(min + " " + max);
	    }
	}
}
