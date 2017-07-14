import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        String inp = br.readLine();
        System.out.println(solve(inp));
    }

    static int solve(String inp) {
        int i = 0;
        int ans = 0;
        while (i<inp.length()) {
            if (inp.substring(i,i+3).equals("SOS") == false) {
                if (inp.substring(i,i+3).charAt(0) != 'S') {
                    ans++;
                }
                if (inp.substring(i,i+3).charAt(1) != 'O') {
                    ans++;
                }
                if (inp.substring(i,i+3).charAt(2) != 'S') {
                    ans++;
                }
            }
            i += 3;
        }
        return ans;
    }
}
