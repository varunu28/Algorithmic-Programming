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
	        int n = Integer.parseInt(s[0]);
	        int target = Integer.parseInt(s[1]);
	        s = br.readLine().split("\\s+");
	        int[] arr = new int[n];
	        
	        for (int i=0; i<n; i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        out.println(getIdx(arr, 0, arr.length-1, target));
	    }
	}
	
	private static int getIdx(int[] arr, int start, int end, int target) {
	    int idx = -1;
	    int min = Integer.MIN_VALUE;
	    
	    while (start <= end) {
	        int mid = (start + end) / 2;
	        if (arr[mid] <= target ) {
	            start = mid + 1;
	            if (arr[mid] > min) {
	                min = arr[mid];
	                idx = mid;
	            }
	        }
	        else {
	            end = mid - 1;
	        }
	    }
	    
	    return idx;
	}
}
