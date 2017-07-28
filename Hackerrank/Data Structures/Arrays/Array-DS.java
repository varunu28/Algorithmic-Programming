import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int tempSum;
        for(int i=1; i < 5; i++) {
            for(int j=1; j < 5; j++) {
                tempSum = arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1] + arr[i+1][j] + arr[i+1][j-1] + arr[i+1][j+1]; 
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        System.out.println(maxSum);
    }
}