import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int div = n;
            int count = 0;
            while (n>0) {
                if ((n%10) != 0) {
                    if (div%(n%10) == 0) {
                        count++;
                    }
                }
                n /= 10;
            }
            System.out.println(count);
        }
    }
}
