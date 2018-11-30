import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine().trim());
	    
	    while (t-- > 0) {
	        String[] strs = br.readLine().split("\\s+");
	        int v = Integer.parseInt(strs[0]);
	        int e = Integer.parseInt(strs[1]);
	        
	        Map<Integer, LinkedHashSet<Integer>> map = new HashMap<>();
	        
	        while (e-- > 0) {
	            strs = br.readLine().split("\\s+");
	            int source = Integer.parseInt(strs[0]);
	            int destination = Integer.parseInt(strs[1]);
	            
	            map.computeIfAbsent(source, k -> new LinkedHashSet<Integer>());
	            map.computeIfAbsent(destination, k -> new LinkedHashSet<Integer>());
	            
	            map.get(source).add(destination);
	            map.get(destination).add(source);
	        }
	        
	        for (int i=0; i<v; i++) {
	            StringBuilder sb = new StringBuilder();
	            sb.append(i);
	            
	            if (!map.containsKey(i)) {
	                System.out.println(sb.toString());
	                continue;
	            }
	            
	            Iterator<Integer> iterator = map.get(i).iterator();
	            while (iterator.hasNext()) {
	                sb.append("-> ").append(iterator.next());
	            }
	            
	            System.out.println(sb.toString());
	        }
	    }
	}
}
