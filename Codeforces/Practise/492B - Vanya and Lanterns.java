import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int l = Integer.parseInt(strs[1]);

        List<Integer> list = Arrays.
                                stream(br.readLine().split("\\s+")).
                                mapToInt(Integer::parseInt).
                                boxed().
                                collect(Collectors.toList());

        solver(n,l, list);
    }

    private static void solver(int n, int l, List<Integer> list) {
        Collections.sort(list);
        double max = list.get(0) - 0;

        for (int i=0; i<n-1; i++) {
            int diff = list.get(i+1) - list.get(i);
            double temp = diff/2.0;
            max = Math.max(temp, max);
        }

        max = Math.max(max, l-list.get(n-1));

        System.out.println(max);
    }
}

