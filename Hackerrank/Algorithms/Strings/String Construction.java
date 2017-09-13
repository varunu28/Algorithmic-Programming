import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s) {
        // Complete this function
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }
        }
        return map.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}

