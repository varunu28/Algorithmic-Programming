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
	        StringBuilder sb = new StringBuilder();
	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c) || Character.isLetter(c)) {
	                sb.append(c);
	            }
	        }
	        
	        String filtered = sb.toString();
	        
	        out.println(filtered.equalsIgnoreCase(sb.reverse().toString()) ? "YES" : "NO");
	    }
	}
}
