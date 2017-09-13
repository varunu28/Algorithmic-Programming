import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        // Complete this function
        int l = s.length();
        int start = 0;
        int end = l-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if((s.charAt(start+1)==s.charAt(end)) && (s.charAt(start+2) == s.charAt(end-1))) {
                    return start;
                }
                else {
                    return end;
                }
            }
            start++;
            end--;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}

