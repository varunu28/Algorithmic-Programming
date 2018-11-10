import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        List<Integer> list = Arrays
                                .stream(strs)
                                .mapToInt(Integer::parseInt)
                                .sorted().boxed()
                                .collect(Collectors.toList());

        System.out.println((list.get(1) - list.get(0)) + (list.get(2) - list.get(1)));
    }
}

