import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main (String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // String[] strs = br.readLine().split("\\s");

        int n = Integer.parseInt(br.readLine());
        int waiting = 3;
        int play1 = 1;
        int play2 = 2;

        List<Integer> list = new ArrayList<>();

        String ans = "YES";

        for (int i=0;i<n;i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i : list) {
            int temp = waiting;

            if (i == waiting) {
                ans = "NO";
                break;
            }

            if (i == play1) {
                waiting = play2;
                play2 = temp;
            }
            else {
                waiting = play1;
                play1 = temp;
            }
        }

        System.out.println(ans);
    }
}
