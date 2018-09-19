import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        int[] arrCopy = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
            arrCopy[i] = arr[i];
        }

        int prev = 0;

        while (true) {
            int changes = 0;
            for (int i=0;i<n;i++) {
                if (arrCopy[i] != 0) {
                    prev = i+1;
                    arrCopy[i] = Math.max(0, arrCopy[i]-m);
                    changes++;
                }
            }
            if (changes == 0) {
                break;
            }
        }
        System.out.println(prev);
    }
}
