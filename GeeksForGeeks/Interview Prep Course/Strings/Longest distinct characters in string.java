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
	        int maxLen = 0;
	        int slow = 0;
	        int fast = 0;
	        
	        while (fast < s.length()) {
	            if (map.containsKey(s.charAt(fast))) {
	                while (slow <= fast && map.containsKey(s.charAt(fast))) {
                        map.put(s.charAt(slow), map.get(s.charAt(slow)) - 1);
                        if (map.get(s.charAt(slow)) == 0) {
                            map.remove(s.charAt(slow));
                        }
                        slow++;
	                }
	            }
	            
	            map.put(s.charAt(fast), 1);
	            maxLen = Math.max(maxLen, map.size());
	            fast++;
	        }
	        
	        out.println(maxLen);
	    }
	}
}
