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
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        
        System.out.println(getComb(n, coins));
    }
    
    static long getComb(int amount, int[] coins) {
        return getCombRec(amount, coins, 0, new HashMap<String, Long>());
    }

    static long getCombRec(int amount, int[] coins, int index, HashMap<String, Long> memo) {

        if (amount == 0) {
            return 1;
        }

        if (index >= coins.length) {
            return 0;
        }

        String key = amount + "-" + index;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int amountWithCoin = 0;
        long ways = 0;

        while (amountWithCoin <= amount) {
            int remaining = amount - amountWithCoin;
            ways += getCombRec(remaining, coins, index+1, memo);
            amountWithCoin += coins[index];
        }

        memo.put(key, ways);

        return ways;
    }

}
