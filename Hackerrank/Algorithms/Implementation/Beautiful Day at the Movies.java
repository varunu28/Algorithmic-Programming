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
        
        int i = Integer.parseInt(strs[0]);
        int j = Integer.parseInt(strs[1]);
        int k = Integer.parseInt(strs[2]);
        
        int c = 0;
        while (i<=j) {
            if (Math.abs(i - Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse().toString()))%k == 0) {
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}