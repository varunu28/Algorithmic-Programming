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
	        int[] counter = new int[26];
	        boolean foundRepeated = false;
	        
	        for (int i=0; i<s.length(); i++) {
	            if (counter[s.charAt(i) - 'a'] == 1) {
	                out.println(s.charAt(i));
	                foundRepeated = true;
	                break;
	            }
	            
	            counter[s.charAt(i) - 'a']++;
	        }
	        
	        if (!foundRepeated) {
	            out.println(-1);
	        }
	    }
	}
}
