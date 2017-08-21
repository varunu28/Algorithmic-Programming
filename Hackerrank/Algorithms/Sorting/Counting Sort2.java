import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strs = br.readLine().trim().split("\\s+");

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int[] arrCount = new int[101];

        for (int i=0;i<n;i++) {
            arrCount[arr[i]]++;
        }

        for (int i=0;i<101;i++) {
            if (arrCount[i] > 0) {
                int j = arrCount[i];
                while (j>0) {
                    System.out.print(i + " ");
                    j--;
                }
            }
        }
    }
}