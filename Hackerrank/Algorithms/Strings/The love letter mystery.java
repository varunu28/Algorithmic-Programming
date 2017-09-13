import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        // Complete this function
        if (s.length() <= 1) return 0;
        int n = s.length()%2 != 0 ? s.length()/2 + 1 : s.length()/2;
        int steps = 0;
        int i=0;
        int j=s.length()-1;
        while (i<n && j>=n) {
            if (s.charAt(i) != s.charAt(j)) {
                steps += Math.abs((int)s.charAt(i) - (int)s.charAt(j));
            }
            i++;
            j--;
        }
        return steps;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}

