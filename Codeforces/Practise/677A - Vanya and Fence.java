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
        int h = Integer.parseInt(strs[1]);

        List<Integer> list = Arrays.
                                stream(br.readLine().split("\\s+")).
                                mapToInt(Integer::parseInt).
                                boxed().
                                collect(Collectors.toList());

        int width = n;

        for (Integer height : list) {
            if (height > h) {
                width++;
            }
        }

        System.out.println(width);
    }
}

