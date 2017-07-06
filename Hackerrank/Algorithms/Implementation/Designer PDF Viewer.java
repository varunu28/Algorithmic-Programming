import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        int area = word.length();
        int max_h = 0;
        for (int i=0;i<word.length();i++) {
            max_h = Math.max(max_h, h[(int)word.charAt(i)-97]);
        }
        System.out.println(area*max_h);
    }
}
