import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.
                                stream(br.readLine().split("\\s+")).
                                mapToInt(Integer::parseInt).
                                boxed().
                                collect(Collectors.toList());

        int rem = list.stream().filter(e -> e%2 == 0).count() > list.stream().filter(e -> e%2 != 0).count() ? 0 : 1;

        for (int i=0; i<list.size(); i++) {
            if (list.get(i)%2 != rem) {
                System.out.println(i+1);
            }
        }
    }
}

