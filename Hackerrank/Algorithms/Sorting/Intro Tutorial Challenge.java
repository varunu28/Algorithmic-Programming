import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int [n];

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
            if (v == arr[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}