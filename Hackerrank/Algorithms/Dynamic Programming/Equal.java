import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while (t > 0) {
            
            int n = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().trim().split("\\s+"); 
            
            int[] arr = new int[n];
            
            for (int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            
            System.out.println(findCount(arr));
        }
    }
    
    public static long findCount(int[] cookies) {

        Arrays.sort(cookies);
        long sum = Long.MAX_VALUE;

        for(int base = 0; base < 3; base++) {
            int current_sum = 0;
            for(int i = 0; i < cookies.length; i++) {
                int delta = cookies[i] - cookies[0] + base;
                current_sum += delta/5 + (delta%5)/2 + (delta%5)%2;
            }
            sum = Math.min(current_sum,sum);
        }

        return sum;
    }
}
