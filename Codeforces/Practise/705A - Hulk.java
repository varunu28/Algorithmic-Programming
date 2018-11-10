import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        String[] past = {"I hate that", "I love that"};
        String[] present = {"I hate it", "I love it"};
        boolean hate = true;

        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            sb.append(hate ? past[0] : past[1]).append(" ");
            hate = !hate;
            n--;
        }

        sb.append(hate ? present[0] : present[1]);

        System.out.println(sb.toString());
    }
}
