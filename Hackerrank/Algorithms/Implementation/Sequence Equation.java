import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] strs = br.readLine().trim().split("\\s+");
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        for (int i=0;i<n;i++) {
            System.out.println(findIndex(arr,findIndex(arr,i+1)+1) + 1);
        }
    }

    public static int findIndex(int[] nums, int elem) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == elem) {
                return i;
            }
        }
        return -1;
    }
}
