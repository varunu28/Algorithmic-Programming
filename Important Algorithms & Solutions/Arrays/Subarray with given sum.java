/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t>0) {
	        String[] strs = br.readLine().split("\\s+");
	        int n = Integer.parseInt(strs[0]);
	        int sum = Integer.parseInt(strs[1]);
	        
	        strs = br.readLine().split("\\s+");
	        int[] arr = new int[n];
	        
	        for (int i=0;i<strs.length;i++) {
	            arr[i] = Integer.parseInt(strs[i]);        
	        }
	        
	        boolean flag = false;
	        
	        int curr_sum = arr[0], start = 0, i;
	        
	        for (i = 1; i <= n; i++) {
	            
	            while (curr_sum > sum && start < i-1) {
	                curr_sum = curr_sum - arr[start];
	                start++;
	            }

	            if (curr_sum == sum) {
	                System.out.println((start + 1) + " " + (i));
	                flag = true;
	                break;
	            }
	            
	            if (i < n) {
	            	curr_sum = curr_sum + arr[i];    
	            }
	        }
	        
	        if (!flag) {
	            System.out.println(-1); 
	        }
	        
	        t--;
	    }
	}
}
