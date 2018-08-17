/*Given an array of penalties, an array of car numbers and also the date. The task is to find the total fine which will
be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test
case consists of three lines. First line of each test case contains two integers N & Date, second line contains N space
separated car numbers and third line contains N space separated penalties.

Output:
For each test case,In new line print the total fine.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheFine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] strs = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(strs[0]);
            int date = Integer.parseInt(strs[1]);

            strs = br.readLine().trim().split("\\s+");
            int[] cars = new int[strs.length];
            for (int i=0; i<strs.length; i++) {
                cars[i] = Integer.parseInt(strs[i]);
            }

            strs = br.readLine().trim().split("\\s+");
            int[] penalties = new int[strs.length];
            for (int i=0; i<strs.length; i++) {
                penalties[i] = Integer.parseInt(strs[i]);
            }

            int rem = date%2;
            int fine = 0;

            for (int i=0; i<cars.length; i++) {
                if (cars[i]%2 != rem) {
                    fine += penalties[i];
                }
            }

            System.out.println(fine);
        }
    }
}
