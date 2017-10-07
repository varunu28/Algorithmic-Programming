import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
        // Complete this function
        
        int[] friends = new int[k];
        int j = 0;
        Arrays.sort(c);
        int sum = 0;
        for (int i=c.length-1;i>=0;i--) {
            sum += (friends[j]+1)*c[i];
            friends[j]++;
            j++;
            if (j == k) j = 0;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}

