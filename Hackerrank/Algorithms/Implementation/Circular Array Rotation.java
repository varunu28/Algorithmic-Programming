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
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        k = k%n;
        while (k>0) {
            a = rotateRight(a);
            k--;
        }
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
    
    public static int[] rotateRight(int[] arr) {
        int prevVal = arr[0];
        for (int i=1;i<arr.length;i++) {
            int temp = arr[i];
            arr[i] = prevVal;
            prevVal = temp;
        }
        arr[0] = prevVal;
        return arr;
    }
}
