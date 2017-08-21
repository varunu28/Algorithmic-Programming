import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[2*n];
        for (int i=0;i<2*n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(solver(arr, n));
    }

    public static String solver(int[] arr, int n) {
        Arrays.sort(arr);
        int check = arr[n-1];
        int ind = findInd(arr, n, arr.length, check);
        if (check != arr[n]) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public static int findInd(int[] arr, int start, int end, int num) {
        for (int i=start;i<end;i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}