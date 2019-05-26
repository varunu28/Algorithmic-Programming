import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int correctCounter = 0;
        int totalCounter = 0;

        while (n > 0) {
            if (n == 1) {
                totalCounter++;
                break;
            }
            totalCounter += n - 1;
            totalCounter += (n - 1) * correctCounter;
            totalCounter += 1;

            correctCounter++;
            n--;
        }

        System.out.println(totalCounter);
    }
}

