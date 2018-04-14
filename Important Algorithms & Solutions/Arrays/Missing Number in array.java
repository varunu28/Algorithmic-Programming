/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while (t>0) {
	        int n = Integer.parseInt(br.readLine());
	        String[] strs = br.readLine().split("\\s+");
	        int sum = (n*(n+1))/2;
	        for (int i=0;i<strs.length;i++) {
	            sum -= Integer.parseInt(strs[i]);
	        }
            
            System.out.println(sum);
	        t--;
	    }
	        
	}
}
