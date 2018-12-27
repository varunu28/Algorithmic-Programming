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
	        int[] count = new int[26];
	        for (char c : s.toCharArray()) {
	            count[c - 'a']++;
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i=25; i>=0; i--) {
	            int val = count[i];
	            for (int j=0; j<val; j++) {
	                sb.append((char) (97 + i));
	            }
	        }
	        
	        out.println(sb.toString());
	    }
	}
}
