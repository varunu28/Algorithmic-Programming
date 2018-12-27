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
	        String a = s[0];
	        String b = s[1];
	        
	        out.println(isAnagram(a, b) ? "YES" : "NO");
	    }
	}
	
	private static boolean isAnagram(String s1, String s2) {
	    int[] count = new int[26];
	    for (char c : s1.toCharArray()) {
	        count[c - 'a']++;
	    }
	    
	    for (char c : s2.toCharArray()) {
	        count[c - 'a']++;
	    }
	    
	    for (int i=0; i<26; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
