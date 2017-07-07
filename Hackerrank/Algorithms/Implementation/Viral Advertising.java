import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        int start = 5;
        
        while (n>0) {
            s += start/2;
            start = (start/2)*3;
            n -= 1;
        }
        System.out.println(s);
    }
}