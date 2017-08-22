import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(arr);
        if (n%2 == 0) {
            System.out.println((arr[n/2-1] + arr[n/2])/2);
        }
        else {
            System.out.println(arr[n/2]);
        }
    }
}
