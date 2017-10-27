import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+"); 
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        
        strs = br.readLine().trim().split("\\s+");
        
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        
        int j = 0;
        int curr = n;
        while (j<n) {
            if (k == 0) {
                break;
            }
            
            if(arr[j] != curr) {
               int temp = arr[j];
               int idx = j;
               while (true) {
                   if (arr[idx] == curr) {
                       break;
                   }
                   idx++;
               }
                
               arr[j] = curr;
               arr[idx] = temp;
               k--;
            }
            curr--;
            j++;
        }
        
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
