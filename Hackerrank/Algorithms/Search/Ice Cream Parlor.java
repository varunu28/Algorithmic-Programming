import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            int ans1 = 0;
            int ans2 = 0;
            int[] arr = new int[m];
            String[] strs = br.readLine().trim().split("\\s+");
            for (int i=0;i<m;i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            outerloop:
            for (int i=0; i<m; i++) {
                for (int j=i+1; j<m; j++) {
                    if (arr[i] + arr[j] == n) {
                        ans1 = i+1;
                        ans2 = j+1;
                        break outerloop;
                    }
                }
            }
            System.out.println(ans1 + " " + ans2);
            t -= 1;
        }
    } 
}