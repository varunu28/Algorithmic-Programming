import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        while (n>0) {
            String[] strs = br.readLine().trim().split("\\s+");
            int l = Integer.parseInt(strs[0]);
            int k = Integer.parseInt(strs[1]);
            
            int[] a = new int[l];
            int[] b = new int[l];
            
            strs = br.readLine().trim().split("\\s+");
            for (int i=0;i<l;i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            
            strs = br.readLine().trim().split("\\s+");
            for (int i=0;i<l;i++) {
                b[i] = Integer.parseInt(strs[i]);
            }
            
            String ans = "YES";
            boolean toBreak = true;
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            int i=0;
            int j=l-1;
            
            while (i < l && j>=0) {
                if (a[i] + b[j] < k) {
                    ans = "NO";
                    break;
                }
                i++;
                j--;
            }
            
            System.out.println(ans);
            n--;
        }
    }
}
