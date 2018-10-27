import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        List<Integer> list = Arrays.
                                stream(br.readLine().split("\\s+")).
                                mapToInt(Integer::parseInt).
                                boxed().
                                collect(Collectors.toList());

        long count = 0;
        int pos = 1;
        for (int house : list) {
            if (house >= pos) {
                count += house - pos;
            }
            else {
                count += n - pos;
                count += house;
            }

            pos = house;
        }

        System.out.println(count);
    }
}

