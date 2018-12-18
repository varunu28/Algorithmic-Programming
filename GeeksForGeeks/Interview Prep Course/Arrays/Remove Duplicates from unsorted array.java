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
	        Set<Integer> set = new LinkedHashSet<>();
	        for (String str : s) {
	            set.add(Integer.parseInt(str));
	        }
	        
	        Iterator<Integer> iter = set.iterator();
	        
	        while(iter.hasNext()) {
	            out.print(iter.next() + " ");
	        }
	        
	        out.println();
	    }
	}
}
