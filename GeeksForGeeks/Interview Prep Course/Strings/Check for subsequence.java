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
	        out.println(isSubsequence(s[0], s[1]) ? 1 : 0);
	    }
	}
	
	private static boolean isSubsequence(String a, String b) {
	    int i = 0;
	    int j = 0;
	    int n1 = a.length();
	    int n2 = b.length();
	    
	    while (i < n1 && j < n2) {
	        if (a.charAt(i) == b.charAt(j)) {
	            i++;
	        }
	        
	        j++;
	    }
	    
	    return i == n1;
	}
}
