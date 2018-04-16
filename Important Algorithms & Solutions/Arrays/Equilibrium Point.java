/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t > 0) {
            int ans = -1;
            int n = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().split("\\s+");
            int[] arr = new int[n];
            int sum = 0;
            for (int i=0;i<strs.length;i++) {
                sum += Integer.parseInt(strs[i]);
                arr[i] += sum;
            }
            
            for (int i=0;i<arr.length;i++) {
                int sumStart = 0;
                int sumEnd = 0;
                
                if (i!=0) {
                    sumStart = arr[i-1];
                }
                
                if (i!=n-1) {
                    sumEnd = arr[n-1] - arr[i];
                }
                
                if (sumStart == sumEnd) {
                    ans = i+1;
                    break;
                }
            }
            
            System.out.println(ans);
            t--;
        }
	}
}
