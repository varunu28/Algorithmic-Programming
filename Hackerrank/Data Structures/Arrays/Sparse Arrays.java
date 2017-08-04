import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i=0;i<n;i++) {
            arr[i] = br.readLine();
        }

        int q = Integer.parseInt(br.readLine());
        for (int i=0;i<q;i++) {
            String quer = br.readLine();
            System.out.println(getCount(arr, quer));
        }
    }

    static int getCount(String[] arr, String s) {
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].equals(s)) {
                count++;
            }
        }
        return count;
    }
}
