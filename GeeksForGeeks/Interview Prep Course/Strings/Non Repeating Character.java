import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int n = Integer.parseInt(br.readLine().trim());
	        String s = br.readLine();
	        
	        int[] count = new int[26];
	        boolean found = false;
	        
	        for (char c : s.toCharArray()) {
	            count[c-'a']++;
	        }
	        
	        for (char c : s.toCharArray()) {
	            if (count[c-'a'] == 1) {
	                found = true;
	                out.println(c);
	                break;
	            }
	        }
	        
	        if (!found) {
	            out.println(-1);
	        }
	    }
	}
}
