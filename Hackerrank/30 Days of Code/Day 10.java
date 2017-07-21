import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bin = convertToBinary(n);
        int count = 0;
        int c = 0;
        for (int i=0;i<bin.length();i++) {
            if(bin.charAt(i) == '1') {
                c++;
            }
            else {
                count = Math.max(c, count);
                c = 0;
            }
        }
        System.out.println(Math.max(c, count));
    }
    
    public static String convertToBinary(int n) {
        StringBuilder s = new StringBuilder("");
        while (n>0) {
            s.append(String.valueOf(n%2));
            n /= 2;
        }
        return s.toString();
    }
}

