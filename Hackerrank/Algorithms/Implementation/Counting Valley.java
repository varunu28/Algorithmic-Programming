import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int valCount = 0;
        int incline = 0;
        boolean climb = false;
        
        for (int i=0;i<n;i++) {
            if (s.charAt(i) == 'U') {
                incline++;
            }
            else {
                incline--;
            }
            if (incline < 0) {
                climb = true;
            }
            if (climb && incline == 0) {
                valCount++;
                climb = false;
            }
        }
        System.out.println(valCount);
    }
}