import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        long limak = Long.parseLong(strs[0]);
        long bob = Long.parseLong(strs[1]);

        int numOfYears = 0;

        while (limak <= bob) {
            limak *= 3;
            bob *= 2;

            numOfYears++;
        }

        System.out.println(numOfYears);
    }
}

