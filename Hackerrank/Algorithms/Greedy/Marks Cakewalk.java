import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(calories, Collections.reverseOrder());
        long miles = 0;
        for(int calories_i=0; calories_i < n; calories_i++){
            miles += calories[calories_i]*Math.pow(2,calories_i);
        }
        System.out.println(miles);
    }
}
