import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        int[] arrCount = new int[100];
        for (int i=0;i<n;i++) {
            arrCount[arr[i]]++;
        }
        for (int i=0;i<100;i++) {
            System.out.print(arrCount[i] + " ");
        }
    }
}