import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        String num = "0123456789";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbol = "!@#$%^&*()-+";
        
        boolean hasNum = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSymbol = false;
        
        for (int i=0;i<password.length();i++) {
            if(num.indexOf(password.charAt(i)) != -1) {
                hasNum = true;
                break;
            }
        }
        
        for (int i=0;i<password.length();i++) {
            if(lower.indexOf(password.charAt(i)) != -1) {
                hasLower = true;
                break;
            }
        }
        
        for (int i=0;i<password.length();i++) {
            if(upper.indexOf(password.charAt(i)) != -1) {
                hasUpper = true;
                break;
            }
        }
        
        for (int i=0;i<password.length();i++) {
            if(symbol.indexOf(password.charAt(i)) != -1) {
                hasSymbol = true;
                break;
            }
        }
        
        int count = 0;
        if (!hasNum) count++;
        if (!hasLower) count++;
        if (!hasUpper) count++;
        if (!hasSymbol) count++;
        
        return Math.max(count, 6 - password.length());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
