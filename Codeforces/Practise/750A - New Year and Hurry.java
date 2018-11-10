import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        int totalMinutes = 240;
        int minutesForContest = totalMinutes - k;
        int questionNum = 1;

        while (minutesForContest > 0 && questionNum <= n) {
            if (minutesForContest - 5 * questionNum >= 0) {
                minutesForContest -= 5 * questionNum;
                questionNum++;
            }
            else {
                break;
            }
        }

        System.out.println(questionNum - 1);
    }
}

