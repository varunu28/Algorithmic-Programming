import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(int amount, long[] coins){
        // Complete this function
        long[] combinations = new long[amount+1];
        combinations[0] = 1;

        for (long coin : coins) {
            for (long i=coin; i<amount+1; i++) {
                if (i>=coin) {
                    combinations[(int) i] += combinations[(int) (i-coin)];
                }
            }
        }

        return combinations[amount];
    }

    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
