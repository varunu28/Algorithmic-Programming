import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        System.out.println(findNumOfExtreme(arr, n));
    }

    private static int findNumOfExtreme(int[] arr, int n) {
        int count = 0;
        for (int i=1;i<n-1;i++) {
            if ((arr[i] < arr[i-1] && arr[i] < arr[i+1]) || (arr[i] > arr[i-1] && arr[i] > arr[i+1])) {
                count++;
            }
        }
        return count;
    }
}
