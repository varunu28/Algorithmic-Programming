import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(findUnique(a, n));
    }

    public static int findUnique(int[] a, int n) {
        
        Arrays.sort(a);

        for (int i=1; i<n; i+=2) {
            if ((a[i-1]^a[i]) != 0) {
                return a[i-1];
            }
        }
        
        return a[n-1];
    }
}
