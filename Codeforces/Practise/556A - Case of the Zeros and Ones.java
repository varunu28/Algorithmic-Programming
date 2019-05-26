import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(getUpdatedLength(s));
    }

    private static int getUpdatedLength(String s) {
        int oneCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
            else {
                zeroCount++;
            }
        }

        return oneCount + zeroCount - 2 * Math.min(zeroCount, oneCount);
    }
}
