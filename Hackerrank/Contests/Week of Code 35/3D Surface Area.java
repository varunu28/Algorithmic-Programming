import java.io.*;

public class Solution {

    static int surfaceArea(int[][] A, int H, int W) {
        int total = 0;

        total += getSum(updateArray(A));

        int area = W*H;
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A[0].length;j++) {
                if (A[i][j] == 0) {
                    area--;
                }
            }
        }

        total += getSum(updateArray(rotateArray(A)));

        total += area;

        return 2*total;
    }

    public static int[][] updateArray(int[][] A) {
        int[][] area = new int[A.length][A[0].length];

        for (int i=0;i<A.length;i++) {
            int prev = 0;
            for (int j=0;j<A[0].length;j++) {
                area[i][j] = Math.max(A[i][j] - prev,0);
                prev = A[i][j];
            }
        }

        return area;
    }

    public static int getSum(int[][] A) {

        int total = 0;

        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A[0].length;j++) {
                total += A[i][j];
            }
        }

        return total;
    }

    public static int[][] rotateArray(int[][] A) {

        int h = A.length;
        int w = A[0].length;

        int [][] output = new int [w][h];

        for (int i=0; i<h; i++) {
            for (int j=0;j<w; j++) {
                output [j][h-1-i] = A[i][j];
            }
        }

        return output;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s");
        int H = Integer.parseInt(strs[0]);
        int W = Integer.parseInt(strs[1]);

        int[][] A = new int[H][W];

        for(int A_i = 0; A_i < H; A_i++){
            strs = br.readLine().split("\\s");
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = Integer.parseInt(strs[A_j]);
            }
        }

        int result = surfaceArea(A,H,W);
        System.out.println(result);

    }
}
