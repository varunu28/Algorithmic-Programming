import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        long num = Long.parseLong(strs[0]);
        Map<String, Integer> map = new HashMap<>();

        while (num-- > 0) {
            String s = br.readLine();
            if (!map.containsKey(s)) {
                Stack<Integer> stack = new Stack<>();
                map.put(s, 0);
                System.out.println("OK");
            }
            else {
                map.put(s, map.get(s) + 1);
                System.out.println(s + map.get(s));
            }
        }
    } 
}
