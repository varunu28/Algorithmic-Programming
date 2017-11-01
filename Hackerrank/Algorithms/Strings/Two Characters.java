import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        ArrayList<Character> set_s = new ArrayList<Character>();
        for (int i=0;i<s.length();i++) {
            if (set_s.indexOf(s.charAt(i)) == -1) {
                set_s.add(s.charAt(i));
            }
        }
        int maxLen = 0;
        String ans = "";
        
        for (int i=0;i<set_s.size();i++) {
            for (int j=1;j<set_s.size();j++) {
                String filtered_s = filter(s,set_s.get(i), set_s.get(j));
                if (isValid(filtered_s)) {
                    if (filtered_s.length() > maxLen) {
                        maxLen =filtered_s.length();
                        ans = filtered_s;
                    }
                }
            }
        }
        
        System.out.println(maxLen);
    }
    
    public static String filter(String s, char a, char b) {
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == a || s.charAt(i) == b) {
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        
        return sb.toString();
    }
    
    public static boolean isValid(String s) {
        for (int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
