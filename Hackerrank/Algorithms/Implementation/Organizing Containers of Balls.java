import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t>0) {
            int n = in.nextInt();
            int[] numOfBox = new int[n];
            int[] numOfBalls = new int[n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    int x = in.nextInt();
                    numOfBox[i] += x;
                    numOfBalls[j] += x;
                }
            }

            String ans = "Possible";

            for (int i=0;i<n;i++) {
                int j = i;
                for (j=i;j<n;j++) {
                    if (numOfBox[i] == numOfBalls[j]) {
                        int temp = numOfBalls[j];
                        numOfBalls[j] = numOfBalls[i];
                        numOfBalls[i] = temp;
                        break;
                    }
                }
                if (j == n) {
                    ans = "Impossible";
                    break;
                }
            }

            System.out.println(ans);
            t--;
        }
    }
}
