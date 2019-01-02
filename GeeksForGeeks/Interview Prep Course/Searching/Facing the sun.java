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
	        String[] strs = br.readLine().split("\\s+");
	        int[] arr = new int[num];	    
	        
	        for (int i=0; i<num; i++) {
	            arr[i] = Integer.parseInt(strs[i]);
	        }
	        
	        int max = Integer.MIN_VALUE;
	        int count = 0;
	        
	        for (int i=0; i<num; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	                count++;
	            }
	        }
	        
	        out.println(count);
	    }
	}
}
