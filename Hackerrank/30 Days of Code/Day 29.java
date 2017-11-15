import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int x=0;x<t;x++) {
            String[] strs = br.readLine().split("\\s");
            int n = Integer.parseInt(strs[0]);
            int k = Integer.parseInt(strs[1]);
            
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = i+1;
            }
            
            int minVal = Integer.MIN_VALUE;
            
            for (int i=0;i<n;i++) {
                for (int j=i+1;j<n;j++) {
                    if ((arr[i] & arr[j]) < k) {
                        minVal = Math.max(minVal, (arr[i] & arr[j]));
                    }
                }
            }
            
            System.out.println(minVal);
        }
    }
}
