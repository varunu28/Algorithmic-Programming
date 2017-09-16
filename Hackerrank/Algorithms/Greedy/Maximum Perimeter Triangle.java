import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strs = br.readLine().trim().split("\\s+");
        
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        
        Arrays.sort(arr);
        
        int i = n-3;
        while (i >= 0 && (arr[i] + arr[i+1] <= arr[i+2])) {
            i--;
        }
        
        if (i >= 0) {
            System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
        }
        else {
            System.out.println(-1);
        }
    }
}
