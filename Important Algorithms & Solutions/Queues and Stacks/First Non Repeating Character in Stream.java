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
	        String[] st = br.readLine().split("\\s+");
	        
	        Queue<Character> queue = new LinkedList<>();
	        int[] map = new int[26];
	        
	        for (String s : st) {
	            char c = s.charAt(0);
	            map[c-'a']++;
	            
	            if (map[c-'a'] == 1) {
	                queue.add(c);
	            }
	            else {
                    while (!queue.isEmpty() && map[queue.peek() - 'a'] > 1) {
                        queue.remove();
                    }
	            }
	            
	            if (queue.isEmpty()) {
	                out.print(-1 + " ");
	            }
	            else {
	                out.print(queue.peek() + " ");
	            }
	        }
	        
	        out.println();
	    }
	}
}
