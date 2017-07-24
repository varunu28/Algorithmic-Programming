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
            int count = 0;
            String check = "hackerrank";
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i) == check.charAt(count)) {
                    count++;
                }
                if (count == check.length()) {
                    break;
                }
            }
            if (count == check.length()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}