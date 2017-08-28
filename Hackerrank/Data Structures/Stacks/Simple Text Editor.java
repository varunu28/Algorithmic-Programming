import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        FastReader fs = new FastReader();

        int q = fs.nextInt();
        Stack<String> strings = new Stack<>();
        strings.push("");

        String s = "";

        StringBuilder sb = new StringBuilder("");
        while (q > 0) {
            s = strings.peek();

            String[] strs = fs.nextLine().trim().split("\\s+");
            if (Integer.parseInt(strs[0]) == 1) {
                s = s + strs[1];
                strings.push(s);
            }
            else if (Integer.parseInt(strs[0]) == 2) {
                s = s.substring(0, s.length() - Integer.parseInt(strs[1]));
                strings.push(s);
            }
            else if (Integer.parseInt(strs[0]) == 3) {
                System.out.println(s.charAt(Integer.parseInt(strs[1])-1));
            }
            else {
                strings.pop();
            }

            q--;
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