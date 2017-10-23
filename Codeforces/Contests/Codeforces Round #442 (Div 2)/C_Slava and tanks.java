import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");

        int n = Integer.parseInt(br.readLine());

        if (n==2) {
            System.out.println(3);
            System.out.println(2 + " " + 1 + " " + 2);
        }
        else {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = 2;
            while (i <= n) {
                arr.add(i);
                i += 2;
            }

            i = 1;
            while (i <= n) {
                arr.add(i);
                i += 2;
            }

            i = 2;
            while (i <= n) {
                arr.add(i);
                i += 2;
            }

            System.out.println(arr.size());
            for (int num:arr) {
                System.out.print(num + " ");
            }
        }
    }
}
