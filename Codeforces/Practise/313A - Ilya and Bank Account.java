import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("\\s+");
        int num = Integer.parseInt(strs[0]);

        System.out.println(Integer.parseInt(helper(strs[0])));
    }

    private static String helper(String num) {
        if (Integer.parseInt(num) >= 0) {
            return num;
        }
        else {
            if (num.length() == 2) {
                return "0";
            }

            String lastDelete = num.substring(0, num.length()-1);
            String lastButOneDelete = num.substring(0, num.length()-2) + num.substring(num.length()-1);

            if (Integer.parseInt(lastButOneDelete) > Integer.parseInt(lastDelete)) {
                return lastButOneDelete;
            }
            else {
                return lastDelete;
            }
        }
    }
}
