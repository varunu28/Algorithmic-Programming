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
	        int countZero = 0;
	        int countOne = 0;
	        int countTwo = 0;
	        
	        for (String s : strs) {
	            if (s.equals("0")) {
	                countZero++;
	            }
	            else if (s.equals("1")) {
	                countOne++;
	            }
	            else {
	                countTwo++;
	            }
	        }
	        
	        int[] arr = new int[n];
	        for (int i=0;i<n;i++) {
	            int temp = -1;
	       
	            if (countZero>0) {
	                temp = 0;
	                countZero--;
	            } 
	            else if (countOne>0) {
	                temp = 1;
	                countOne--;
	            }
	            else {
	                temp = 2;
	                countTwo--;
	            }
	            arr[i] = temp;
	        }
	        
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        t--;
	    }
	}
}
