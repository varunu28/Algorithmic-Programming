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
	        String target = br.readLine();
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : target.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        int count = map.size();
	        int minLen = Integer.MAX_VALUE;
	        
	        int slow = 0;
	        int fast = 0;
	        String word = "";
	        
	        while (fast < s.length()) {
	            if (map.containsKey(s.charAt(fast))) {
	                map.put(s.charAt(fast), map.get(s.charAt(fast)) - 1);
	                if (map.get(s.charAt(fast)) == 0) {
	                    count--;
	                }
	            }
	            
	            while (count == 0) {
	                if (minLen > (fast - slow)) {
	                    minLen = fast - slow;
	                    word = s.substring(slow, fast + 1);
	                }
	                
	                if (map.containsKey(s.charAt(slow))) {
	                    map.put(s.charAt(slow), map.get(s.charAt(slow)) + 1);
	                    if (map.get(s.charAt(slow)) == 1) {
	                        count++;
	                    }
	                }
	                
	                slow++;
	            }
	            
	            fast++;
	        }
	        
	        out.println(word.equals("") ? -1 : word);
	    }
	}
}
