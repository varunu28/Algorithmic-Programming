import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            String s = br.readLine();
            StringBuilder odd = new StringBuilder("");
            StringBuilder even = new StringBuilder("");
            
            for (int i=0;i<s.length();i++) {
                if (i%2 == 0) {
                    odd.append(String.valueOf(s.charAt(i)));
                }
                else {
                    even.append(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(odd.toString() + " " + even.toString());
            t--;
        }
        
    }
}