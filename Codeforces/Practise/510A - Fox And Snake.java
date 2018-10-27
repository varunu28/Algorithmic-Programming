import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        char[][] arr = new char[n][m];

        int i = 0;
        int j = 0;
        int dir = 0;
        while (i < n) {
            if (dir == 0) {
                while (j<m) {
                    arr[i][j] = '#';
                    j++;
                }
                i++;
                j--;
                dir=1;
            }
            else if (dir == 1) {
                int count = 0;
                arr[i][j] = '#';
                i++;

                dir = j == 0 ? 0 : 2;
            }
            else if (dir == 2) {
                while (j >= 0) {
                    arr[i][j] = '#';
                    j--;
                }
                i++;
                j++;
                dir = 1;
            }
        }

        for (i=0;i<n;i++) {
            for (j=0;j<m;j++) {
                if (arr[i][j] != '#') {
                    arr[i][j] = '.';
                }
            }
        }

        printSnake(arr);
    }

    private static void printSnake(char[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }
}
