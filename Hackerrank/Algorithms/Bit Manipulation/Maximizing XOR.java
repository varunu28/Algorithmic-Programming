import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int maxVal = Integer.MIN_VALUE;
        
        int i = l;
        
        while (i <= r) {
            int j = i;
            while (j <= r) {
                maxVal = Math.max(maxVal,i^j);
                j++;
            }
            
            i++;
        }
        
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
