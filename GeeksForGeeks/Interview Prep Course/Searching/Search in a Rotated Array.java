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
	        for (int i=0; i<n; i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        int target = Integer.parseInt(br.readLine());
	        
	        out.println(findIdx(arr, 0, n-1, target));
	    }
	}
	
	private static int findIdx(int[] arr, int start, int end, int target) {
	    if (start > end) {
	        return -1;
	    }
	    
	    int mid = (start + end) / 2;
	    if (arr[mid] == target) {
	        return mid;
	    }
        
        return Math.max(findIdx(arr, start, mid - 1, target), findIdx(arr, mid + 1, end, target)); 
	}
}
