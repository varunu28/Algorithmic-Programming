import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strs = br.readLine().trim().split("\\s+");
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        int count = 0;
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if (findSum(arr, i, j) < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    public static int findSum(int[] arr, int low, int high) {
        int sum = 0;
        while (low <= high) {
            sum += arr[low];
            low++;
        }
        return sum;
    }
}