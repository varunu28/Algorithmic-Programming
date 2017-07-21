import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int onceInATram(int x) {
        // Complete this function
        int ans = x + 1;
        while (true) {
            if (leftSum(ans) == rightSum(ans))
            {
                return ans;
            }
            ans++;
        }
    }
    
    static int leftSum(int n) {
        int sum = 0;
        int i = 0;
        String num = String.valueOf(n);
        while (i<3) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            i++;
        }
        return sum;
    }
    
    static int rightSum(int n) {
        int sum = 0;
        int i = 3;
        String num = String.valueOf(n);
        while (i<6) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = onceInATram(x);
        System.out.println(result);
    }
}

