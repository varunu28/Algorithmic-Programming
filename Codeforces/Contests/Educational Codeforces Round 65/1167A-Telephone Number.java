import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            System.out.println(isTelephoneNumber(s, n));
        }
    }

    private static String isTelephoneNumber(String s, int n) {
        int idx = 0;
        while (idx < n) {
            if (s.charAt(idx) == '8') {
                break;
            }

            idx++;
        }

        return n - idx - 1 >= 10 ? "YES" : "NO";
    }
}

