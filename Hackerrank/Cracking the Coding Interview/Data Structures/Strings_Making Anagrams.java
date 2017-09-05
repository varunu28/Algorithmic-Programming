import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] asciiFirst = new int[26];
        int[] asciiSecond = new int[26];
        
        for (int i=0;i<first.length();i++) {
            asciiFirst[(int)first.charAt(i) - 97]++;
        }
        
        for (int i=0;i<second.length();i++) {
            asciiSecond[(int)second.charAt(i) - 97]++;
        }
        
        int del = 0;
        
        for (int i=0;i<26;i++) {
            if (asciiFirst[i] != asciiSecond[i]) {
                del += Math.abs(asciiFirst[i] - asciiSecond[i]);
            }
        }
        
        return del;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

