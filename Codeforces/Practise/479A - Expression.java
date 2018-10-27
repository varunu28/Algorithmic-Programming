import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int ans = a + b + c;
        ans = Math.max(ans, (a+b)*c);
        ans = Math.max(ans, (a+(b*c)));
        ans = Math.max(ans, (a*b*c));
        ans = Math.max(ans, (a*(b+c)));

        System.out.println(ans);
    }
}
