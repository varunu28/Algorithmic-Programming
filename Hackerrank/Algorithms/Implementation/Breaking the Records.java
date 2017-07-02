import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] score = {0,0};
        int max_score = s[0];
        int min_score = s[0];
        for (int i=1;i<s.length;i++) {
            if (s[i] > max_score) {
                max_score = s[i];
                score[0]++;
            }
            if (s[i] < min_score) {
                min_score = s[i];
                score[1]++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
