import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String acidNaming(String acid_name) {
        // Complete this function
        if (acid_name.startsWith("hydro") && acid_name.endsWith("ic")) {
            return "non-metal acid";
        }
        else if (acid_name.endsWith("ic")) {
            return "polyatomic acid";
        }
        else {
            return "not an acid";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
