import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a,n,b;
        while (t>0) {
            t--;
            n = Integer.parseInt(br.readLine()) - 1;
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            
            int small = Math.min(a,b);
            int big = Math.max(a,b);
            
            int start = n*small;
            int end = n*big;
            
            int diff = big - small;
            if (diff == 0) {
                System.out.println(start);
            }
            else {
                StringBuilder sb = new StringBuilder("");
                while (start <= end) {
                    sb.append(String.valueOf(start) + " ");
                    start += diff;
                }
                
                System.out.println(sb.toString());
            }
        }
    }
}
