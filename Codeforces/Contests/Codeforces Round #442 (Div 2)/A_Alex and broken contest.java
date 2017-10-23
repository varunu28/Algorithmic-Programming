import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        //int n = Integer.parseInt(br.readLine());
        String[] friends = {"Danil", "Olya", "Slava", "Ann", "Nikita"};

        String problem = br.readLine();
        int count = 0;

        for (int i=0;i<friends.length;i++) {
            if (problem.contains(friends[i])) {
                int c = problem.indexOf(friends[i]);
                count++;

                if (problem.substring(c+friends[i].length()).contains(friends[i]) == true) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count == 1 ? "YES" : "NO");
    }
}
