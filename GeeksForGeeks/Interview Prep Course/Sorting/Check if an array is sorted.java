import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int num = Integer.parseInt(br.readLine());
	        String[] s = br.readLine().split("\\s+");
	        int[] arr = new int[num];
	        for (int i=0; i<num; i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        out.println(isSorted(arr));
	    }
	}
	
	private static int isSorted(int[] arr) {
	    for (int i=0; i<arr.length-1; i++) {
	        if (arr[i] > arr[i+1]) {
	            return 0;
	        }
	    }
	    return 1;
	}
}
