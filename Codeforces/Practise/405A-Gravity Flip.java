import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split("\\s+");
        List<Integer> list = new ArrayList<>();

        for (String str : strs) {
            list.add(Integer.parseInt(str));
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

