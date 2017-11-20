import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split("\\s");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        int[][] arr = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==0 && j==0) {
                    arr[i][j] = m;
                }
                else if (i == j) {
                    arr[i][j] = arr[i-1][j-1] + k;
                }
                else if (i > j) {
                    arr[i][j] = arr[i-1][j] - 1;
                }
                else if (i < j) {
                    arr[i][j] = arr[i][j-1] - 1;
                }
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
