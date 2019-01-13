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
	        int zeroCount = 0;
	        int oneCount = 0;
	        int twoCount = 0;
	        
	        for (String str : s) {
	            if (str.equals("0")) {
	                zeroCount++;
	            }
	            else if (str.equals("1")) {
	                oneCount++;
	            }
	            else {
	                twoCount++;
	            }
	        }
	        
	        out.print(zeroCount > 0 ? String.join(" ", Collections.nCopies(zeroCount, "0")) + " " : "");
	        out.print(oneCount > 0 ? String.join(" ", Collections.nCopies(oneCount, "1")) + " " : "");
	        out.print(String.join(" ", Collections.nCopies(twoCount, "2")));
	        
	        out.println();
	    }
	}
}
