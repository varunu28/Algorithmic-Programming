import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int diff = Math.abs(arr[0]-arr[1]);
        ArrayList<Integer> count = new ArrayList<>();
        for (int i=0;i<n-1;i++) {
            if (Math.abs(arr[i]-arr[i+1]) < diff) {
                diff = Math.abs(arr[i]-arr[i+1]);
            }
        }

        for (int i=0;i<n-1;i++) {
            if (Math.abs(arr[i]-arr[i+1]) == diff) {
                count.add(arr[i]);
                count.add(arr[i+1]);
            }
        }
        for (int i=0;i<count.size();i++) {
            System.out.print(count.get(i) + " ");
        }
    }
}
