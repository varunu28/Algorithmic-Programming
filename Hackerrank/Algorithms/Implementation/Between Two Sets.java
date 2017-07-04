import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b, int a_max, int b_min){
        // Complete this function
        int c = 0;
        while (a_max <= b_min) {
            if (aTest(a, a_max) && bTest(b, a_max)) {
                c++;
            }
            a_max++;
        }
        return c;
    }
    
    static boolean aTest(int[] a, int a_max) {
        for (int i=0;i<a.length;i++) {
            if (a_max%a[i] != 0){
                return false;
            }
        }
        return true;
    }
    
    static boolean bTest(int[] b, int a_max) {
        for (int i=0;i<b.length;i++) {
            if (b[i]%a_max != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a_max = 0;
        int b_min = 101;
        
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            a_max = Math.max(a_max,a[a_i]);
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            b_min = Math.min(b_min,b[b_i]);
        }
        int total = getTotalX(a, b, a_max, b_min);
        System.out.println(total);
    }
}
