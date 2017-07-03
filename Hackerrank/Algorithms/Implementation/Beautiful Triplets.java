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

        String[] strs = br.readLine().trim().split("\\s+");
        int n =  Integer.parseInt(strs[0]);
        int d = Integer.parseInt(strs[1]);
        int[] arr = new int[n];

        strs = br.readLine().trim().split("\\s+");
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int count = 0;

        for (int i=0;i<n;i++) {
            int val1 = arr[i] + d;
            int ind1 = binarySearch(arr, i+1, n-1, val1);
            if (ind1 != -1 && ind1 != n - 1) {
                int val2 = arr[ind1] + d;
                int ind2 = binarySearch(arr, ind1 + 1, n-1, val2);
                if (ind2 != -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int binarySearch(int[] arr,int left,int right,int value) {
        int found=0,copy;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(value==arr[mid])
            {
                found=1;
                copy = mid;
                return mid;
            }
            else
            {
                if(value<arr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        if(found==0)
        {
            return -1;
        }
        return -1;
    }
}
