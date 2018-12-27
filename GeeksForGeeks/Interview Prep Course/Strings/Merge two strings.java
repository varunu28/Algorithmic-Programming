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
	        
	        int i = 0;
	        int j = 0;
	        int n1 = a.length();
	        int n2 = b.length();
	        boolean first = true;   
	         
	        while (i < n1 && j < n2) {
	           if (first) {
	               out.print(a.charAt(i));
	               i++;
	           }
	           else {
	               out.print(b.charAt(j));
	               j++;
	           }
	           
	           first = !first;
	        }
	        
	        while (i < n1) {
	            out.print(a.charAt(i));
	            i++;
	        }
	        
	        while (j < n2) {
	            out.print(b.charAt(j));
	            j++;
	        }
	        
	        out.println();
	    }
	}
}
