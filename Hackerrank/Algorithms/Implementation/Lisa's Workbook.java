import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int pageNum = 1;
        int special = 0;
        strs = br.readLine().trim().split("\\s+");
        int j = 0;
        
        while (j<n) {
            int num = Integer.parseInt(strs[j]);
            int l = 1;
            while (true) {
                if (l == pageNum) {
                    special++;
                }
                l++;
                if (l > num) break;
                if (l%k == 1 || k == 1) {
                    pageNum++;
                }
            }
            pageNum++;
            j++;
        }
        
        System.out.println(special);
    }
}
