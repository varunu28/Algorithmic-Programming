import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class GFG {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());

            System.out.println(
                    IntStream.
                        range(1, num+1).
                        map(e -> Integer.bitCount(e)).
                        reduce((x, y) -> x + y).
                        getAsInt()
                    );
        }
    }
}

