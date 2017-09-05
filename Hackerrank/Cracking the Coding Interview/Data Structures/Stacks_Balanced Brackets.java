import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        String start = "{[(";
        String end = "}])";

        for (int i=0;i<expression.length();i++) {

            if (start.indexOf(expression.charAt(i)) != -1) {
                stack.push(expression.charAt(i));
            }
            else {
                if (!stack.empty()) {
                    Character c = stack.pop();
                    if (start.indexOf(c) != end.indexOf(expression.charAt(i))) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        
        
    }
}

