import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(arr);
        int count = 1;
        int prev = arr[0];
        int i = 1;
        while(i < n) {
            if ((prev+4) < arr[i]) {
                prev = arr[i];
                count++;
            } 
            i++;
        }
        System.out.println(count);
    }
}
