import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strs = br.readLine().trim().split("\\s+");
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        
        int swap = 0;
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n-1]);
    }
}
