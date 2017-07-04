import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] count = {0,0,0,0,0};
        for (int i=0;i<n;i++) {
            count[ar[i]-1]++;
        }
        int maxCount = 0;
        int minId = 0;
        
        for (int i=0;i<5;i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                minId = i+1;
            }
        }
        return minId;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
