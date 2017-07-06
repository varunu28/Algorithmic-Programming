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
            boolean spring = true;
            int h = 1;
            while (n>0) {
                if (spring) {
                    h *= 2;
                    spring = false;
                }
                else {
                    h++;
                    spring = true;
                }
                n--;
            }
            System.out.println(h);
        }
    }
}
