import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Map<Integer, Integer> map = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(countStairs(n));
        }
    }

    public static int countStairs(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        
        if (!map.containsKey(n)) {
            int count = countStairs(n-1) +  countStairs(n-2) + countStairs(n-3);
            map.put(n, count);
        } 
        
        return map.get(n);
    }
}
