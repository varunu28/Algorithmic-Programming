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
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        boolean oddFound = false;
	        String ans = "Yes";
	        
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() % 2 != 0) {
	                if (oddFound) {
	                    ans = "No";
	                    break;
	                }
	                
	                oddFound = true;
	            }
	        }
	        
	        out.println(ans);
	    }
	}
}
