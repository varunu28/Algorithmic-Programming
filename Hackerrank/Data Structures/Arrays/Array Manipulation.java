import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        long[] arr = new long[n];
        
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            arr[a-1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }
        
        long maxSum =0;
        long x = 0;
        
        for (int i=0;i<n;i++) {
            x = x + arr[i];
            if (maxSum < x) {
                maxSum = x;
            }
        }
        
        System.out.println(maxSum);
        
        in.close();
    }
}
