import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int numSteps = 0;
        int[] validSteps = {5, 4, 3, 2, 1};

        for (int step : validSteps) {
            if (num/step > 0) {
                numSteps += num/step;
                num = num%step;
            }
        }

        System.out.println(numSteps);
    }
}

