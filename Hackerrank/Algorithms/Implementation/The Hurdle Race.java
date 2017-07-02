import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max_ = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > max_) {
                max_ = height[height_i];
            }
        }
        // your code goes here
        System.out.println(Math.max(0,max_-k));
    }
}
