import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        while(s > 0 && p <= s) {
            count++;
            s -= p;
            if (p-d > m) {
                p -= d;
            }
            else {
                p = m;
            }
        }
        
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
