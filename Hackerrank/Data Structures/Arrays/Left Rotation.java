
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int d = Integer.parseInt(strs[1]);

        strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        
        d = d%arr.length;

        while (d > 0) {
            arr = rotate(arr);
            d--;
        }

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rotate(int[] arr) {
        int firstElem = arr[0];
        for (int i=0;i<arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = firstElem;
        return arr;
    }
}
