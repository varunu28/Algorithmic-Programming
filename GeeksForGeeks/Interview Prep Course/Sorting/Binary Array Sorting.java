import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int n = Integer.parseInt(br.readLine().trim());
	        String[] strs = br.readLine().split("\\s+");
	        int numZeros = 0;
	        int numOnes = 0;
	        
	        for (String str : strs) {
	            if (str.equals("1")) {
	                numOnes++;
	            }
	            else {
	                numZeros++;
	            }
	        }
	        
	        while (numZeros-- > 0) {
	            out.print(0 + " ");
	        }
	        
	        while (numOnes-- > 0) {
	            out.print(1 + " ");
	        }
	        
	        out.println();
	    }
	}
}
