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
	        int m = Integer.parseInt(s[0]);
	        int k = Integer.parseInt(s[1]);
	        int n = Integer.parseInt(s[2]);
	        
	        List<String> list = getBinary(m);
	        
	        for (int i=0; i<n; i++) {
	            list = performIteration(list);
	        }
	        
	        out.println(list.get(k));
	    }
	}
	
	private static List<String> getBinary(int m) {
	    List<String> binary = new ArrayList<>();
	    while (m > 0) {
	        binary.add(String.valueOf(m % 2));
	        m /= 2;
	    }
	    
	    Collections.reverse(binary);
	    
	    return binary;
	}
	
	private static List<String> performIteration(List<String> list) {
	    List<String> ans = new ArrayList<>();
	    
	    for (String s : list) {
	        if (s.equals("0")) {
	            ans.add("0");
	            ans.add("1");
	        }
	        else {
	            ans.add("1");
	            ans.add("0");
	        }
	    }
	    
	    return ans;
	}
}
