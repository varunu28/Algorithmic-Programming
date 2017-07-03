import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int d = 999999;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (A[i] == A[j]) {
                    d = Math.min(Math.abs(i-j),d);
                }
            }
        }
        if (d == 999999) {
            System.out.println(-1);
        }
        else {
            System.out.println(d);
        }
    }
}
