import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] strs = br.readLine().trim().split("\\s+"); 
            
            for (int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            
            if (n%2 == 0) {
                System.out.println(0);
            }
            else {
                int xorVal = arr[0];
                int k=2;
                while(k < n) {
                    xorVal = xorVal^arr[k];
                    k += 2;
                }
                System.out.println(xorVal);
            }
            
            t--;
        }
    }
}
