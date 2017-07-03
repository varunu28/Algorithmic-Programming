import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        if (n==p || p == 1 || (n%2==1 && p == n-1)) {
            return 0;
        }
        else if ((n%2==0 && p == n-1) || p == 2){
            return 1; 
        }
        else{
            if (p%2 == 0){
                return Math.min(p,Math.abs(n-p))/2;
            }
            return Math.min(Math.abs(p-1),Math.abs(n-p))/2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
