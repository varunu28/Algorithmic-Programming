import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        
        String  lines = br.readLine();    
        String[] strs = lines.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }
        
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for (int i=0;i<n;i++) {
            if (a[i] > 0) {
                pos++;
            }
            else if (a[i] < 0) {
                neg++;
            }
            else {
                zer++;
            }
        }
        
        System.out.printf("%.6f\n", (float)pos/n);
        System.out.printf("%.6f\n", (float)neg/n);
        System.out.printf("%.6f\n", (float)zer/n);
    }
}