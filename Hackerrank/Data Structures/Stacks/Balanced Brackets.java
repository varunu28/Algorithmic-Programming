import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        Stack<Character> stack = new Stack<Character>();
        String open = "{[(";
        String close = "}])";
        for (int i=0;i<s.length();i++) {
            if (open.indexOf(s.charAt(i)) != -1) {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()) {
                    return "NO";
                }
                else {
                    Character out = stack.pop();
                    if (close.indexOf(s.charAt(i)) != open.indexOf(out)) {
                        return "NO";
                    }
                }
            }
        }
        if (stack.empty()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}