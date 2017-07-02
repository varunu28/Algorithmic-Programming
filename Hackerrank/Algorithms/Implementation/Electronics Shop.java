import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        if (keyboards[0] + drives[0] > s) {
            return -1;
        }
        int max_sum = 0;
        for (int i=0;i<keyboards.length;i++) {
            for (int j=0;j<drives.length;j++) {
                if (keyboards[i] + drives[j] < s) {
                    max_sum = Math.max(max_sum,keyboards[i] + drives[j]);
                }
                else if (keyboards[i] + drives[j] == s) {
                    return s;
                }
                else {
                    break;
                }
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}

