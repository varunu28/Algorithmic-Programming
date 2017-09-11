import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        boolean[] hasStation = new boolean[n];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
            hasStation[c[c_i]] = true;
        }
        
        if (n == m) {
            System.out.println(0);
        }
        else {
            int[] dist = new int[n];
            for (int i=0;i<n;i++) {
                if (!hasStation[i]) {
                    if (i == 0) {
                        dist[i] = findDist(hasStation, i, false);
                    }
                    else if (i == n-1) {
                        dist[i] = findDist(hasStation, i, true);
                    }
                    else {
                        dist[i] = Math.min(findDist(hasStation, i, true), findDist(hasStation, i, false));
                    }
                }
            }
            
            Arrays.sort(dist);
            System.out.println(dist[n-1]); 
        }
    }
    
    public static int findDist(boolean[] arr, int i, boolean back) {
        int c = 0;
        if (!back) {
            int j = i+1;
            while (j < arr.length) {
                if (arr[j]) {
                    break;
                }
                c++;
                j++;
            }
        }
        else {
            int j = i-1;
            while (j >= 0) {
                if (arr[j]) {
                    break;
                }
                c++;
                j--;
            }
        }
        return c+1;
    }
}

