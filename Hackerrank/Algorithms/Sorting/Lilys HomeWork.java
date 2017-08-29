import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution{
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        String[] strs = fs.nextLine().trim().split("\\s+");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int[] revArr = new int[n];
        int j = 0;
        for (int i=n-1;i>=0;i--) {
            revArr[j] = arr[i];
            j++;
        }

        System.out.println(Math.min(getNumSwaps(arr, n), getNumSwaps(revArr, n)));
    }

    public static int getNumSwaps(int[] arr, int n) {
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i=0;i<n;i++) {
            map2.put(arr[i], i);
        }

        int[] arrCopy = new int[n];

        System.arraycopy(arr,0, arrCopy,0, n);

        Arrays.sort(arr);

        int Swaps = 0;

        for (int i=0;i<n;i++) {
            int cv = arrCopy[i];
            int scv = arr[i];
            if (cv != scv) {
                Swaps++;

                // Swap
                int ind = map2.get(scv);
                map2.replace(cv, map2.get(cv), ind);
                int temp = cv;
                arrCopy[i] = scv;
                arrCopy[ind] = temp;
            }
        }
        return Swaps;
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
