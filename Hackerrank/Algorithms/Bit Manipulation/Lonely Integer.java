import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        // Complete this function
        Arrays.sort(a);
        for (int i=1;i<a.length;i+=2) {
            if ((a[i]^a[i-1]) != 0) {
                return a[i-1];
            }
        }
        return a[a.length-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
