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
	        
	        int[] arr = new int[n];
	        for (int i=0; i<s.length; i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        // Solution here
	        int[] ans = new int[n];
	        for (int i=0; i<n; i++) {
	            int number = arr[i];
	            int count = 0;
	            for (int j=i+1; j<n; j++) {
	                if (arr[j] < number) {
	                    count++;
	                }
	            }
	            
	            ans[i] = count;
	        }
	        
	        for (int num : ans) {
	            out.print(num + " ");
	        }
	        out.println();
	    }
	}
}
