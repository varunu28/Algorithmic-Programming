import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            boolean isTrue = false;
            long firstNum = -1;
            
            for (int i=1;i<=s.length()/2;i++) {
                long x = Long.parseLong(s.substring(0,i));
                firstNum = x;
                String test = Long.toString(x);
                while (test.length() < s.length()) {
                    test = test + Long.toString(++x);
                }
                if (test.equals(s)) {
                    isTrue = true;
                    break;
                }
            }
            System.out.println(isTrue ? "YES " + firstNum : "NO");
        }
    }
}

