import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] buck = new int[1001];
        
        String[] strs = br.readLine().trim().split("\\s+");
        int count = 0;
        
        for (int i=0;i<n;i++) {
            buck[Integer.parseInt(strs[i])]++;
        }
        
        strs = br.readLine().trim().split("\\s+");
        
        for (int i=0;i<n;i++) {
            int num = Integer.parseInt(strs[i]);
            if (buck[num] > 0) {
                buck[num]--;
                count++;
            }
        }
        
        if (count == n) {
            count--;
        }
        else {
            count++;
        }
        
        System.out.println(count);
    }
}
