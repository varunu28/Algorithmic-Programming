import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            int n = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            String ans = "NO";
            int sumRight = findSum(arr);
            int prev = 0;
            int sumLeft = 0;

            for (int i=0;i<n;i++) {
                int temp = arr[i];
                sumLeft += prev;
                sumRight -= temp;
                if (sumLeft == sumRight) {
                    ans = "YES";
                    break;
                }
                prev = temp;
            }
            System.out.println(ans);
            t--;
        }
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
}