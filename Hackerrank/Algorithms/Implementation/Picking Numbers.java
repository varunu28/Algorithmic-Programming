import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int maxCount = 0;
        for (int i=0;i<n;i++) {
            int c = 1;
            for (int j=0;j<n;j++) {
                if (i!=j && (a[j] == a[i]+1 || a[j] == a[i])) {
                    c++;
                }
            }
            maxCount = Math.max(maxCount, c);
        }
        System.out.println(maxCount);
    }
}
