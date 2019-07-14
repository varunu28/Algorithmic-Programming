import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int[][] dirs = {{0, 00}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[0].length; j++) {
                maxSum = Math.max(maxSum, getHourGlassSum(arr, i, j));
            }
        }

        return maxSum;
    }

    private static int getHourGlassSum(int[][] arr, int x, int y) {
        if (x + 2 >= arr.length || y + 2 >= arr[0].length) {
            return Integer.MIN_VALUE;
        }

        int tempSum = 0;
        for (int[] dir : dirs) {
            tempSum += arr[x + dir[0]][y + dir[1]];
        } 

        return tempSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

