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
	        
	        Map<Integer, Integer> map = new HashMap<>();
	        int limit = n/2;
	        int ans = -1;
	        
	        for (int i=0; i<s.length; i++) {
	            int key = Integer.parseInt(s[i]);
	            map.put(key, map.getOrDefault(key, 0) + 1);
	            
	            if (map.get(key) > limit) {
	                ans = key;
	                break;
	            }
	        }
	        
	        out.println(ans);
	    }
	}
}
