import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution{

    static long inversions = 0;
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t>0) {
            int n = fs.nextInt();
            String[] strs = fs.nextLine().trim().split("\\s+");
            int[] arr = new int[n];
            int[] temp = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            MS(arr, temp, 0,n-1);
            System.out.println(inversions);
            inversions = 0;
            t--;
        }

    }

    public static void MS(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            MS(arr, temp, left, mid);
            MS(arr,  temp,mid + 1, right);
            merge(arr, temp, left, mid, right);
        }

    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i=left;i<=right;i++) {
            temp[i] = arr[i];
        }

        int i= left;
        int j = mid + 1;
        int k = left;

        while (i<=mid && j<=right) {
            if (temp[i] <=temp[j]) {
                arr[k] = temp[i];
                i++;
            }
            else {
                arr[k] = temp[j];
                j++;
                inversions += mid - i + 1;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
