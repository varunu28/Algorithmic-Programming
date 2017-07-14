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
        System.out.println(reduceString(inp).length() == 0 ? "Empty String" : reduceString(inp));
    }

    static String reduceString(String inp) {
        StringBuilder sb = new StringBuilder("");
        int n = inp.length();
        int i = 0;
        while (i<n) {
            if (sb.length()>0 && inp.charAt(i) != sb.charAt(sb.length()-1)) {
                sb.append(inp.charAt(i));
            }
            else if (sb.length()>0 && inp.charAt(i) == sb.charAt(sb.length()-1)) {
                sb.deleteCharAt(sb.length()-1);
            }
            else if (sb.length() == 0) {
                sb.append(inp.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
