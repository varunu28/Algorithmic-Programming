import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        k = k%n;
        
        while (k > 0) {
            int first = a[0];
            for (int i=0;i<n-1;i++) {
                a[i] = a[i+1];
            }
            a[n-1] = first;
            k--;
        }
        
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i] + " ");
        }
    }
}

