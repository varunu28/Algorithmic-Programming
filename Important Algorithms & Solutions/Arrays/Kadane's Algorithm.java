/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while (t>0) {
	        int n = Integer.parseInt(br.readLine());
	        String[] strs = br.readLine().split("\\s+");
	        int[] arr = new int[n];
	        
	        for (int i=0;i<strs.length;i++) {
	            arr[i] = Integer.parseInt(strs[i]);
	        }
	        
	        System.out.println(findMaxSum(arr, n));
	        t--;
	    }
	}
	
	public static int findMaxSum(int[] arr, int n) {
	    int max = arr[0];
	    int currMax = 0;
	    
	    for (int i=0;i<n;i++) {
	        currMax += arr[i];
	        if (currMax < 0) {
	            currMax = 0;
	        }
	        else if(currMax > max) {
	            max = currMax;
	        }
	        
	    }
	    
	    return max;
	}
}
