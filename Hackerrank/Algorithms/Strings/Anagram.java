import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String first, String second){
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
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            if (s.length()%2 != 0) {
                System.out.println(-1);
            }
            else {
                String s1 = s.substring(0, s.length()/2);
                String s2 = s.substring(s.length()/2, s.length());
                int result = anagram(s1, s2);
                System.out.println(result/2);
            }
        }
    }
}

