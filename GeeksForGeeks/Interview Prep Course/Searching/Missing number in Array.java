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
	        int[] arr = new int[n];
	        int[] count = new int[n];
	        String[] strs = br.readLine().split("\\s+");
	        for (int i=0; i<strs.length; i++) {
	            arr[i] = Integer.parseInt(strs[i]);
	            count[arr[i] - 1]++;
	        }
	        
	        for (int i=0; i<n; i++) {
	            if (count[i] == 0) {
	                out.println(i+1);
	                break;
	            }
	        }
	    }
	}
}
