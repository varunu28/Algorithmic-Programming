import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            int[] arr = new int[n+1];
            for (int i=1;i<=n;i++) {
                arr[i] = i;
            }
            
            int[] ans = new int[n];
            boolean isPossible = true;
            
            for (int i=1;i<=n;i++) {
                if ((i-k) > 0 && arr[i-k] != 0) {
                    ans[i-1] = arr[i-k];
                    arr[i-k] = 0;
                }
                else if ((i+k) <= n && arr[i+k] != 0) {
                    ans[i-1] = arr[i+k];
                    arr[i+k] = 0;
                }
                else {
                    isPossible = false;
                    break;
                }
            }
            
            if (isPossible) {
                for (int i=0;i<n;i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
