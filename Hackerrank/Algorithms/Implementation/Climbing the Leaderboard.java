import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int scores_i;
        int prev_score = in.nextInt();
        int curr_score;
        List<Integer> dense_ranks = new ArrayList<>();
        dense_ranks.add(prev_score);

        for(scores_i = 1; scores_i < n; scores_i++) {

            curr_score = in.nextInt();

            if (curr_score < prev_score) 
            {
                dense_ranks.add(curr_score);
                prev_score = curr_score;
            }
        }

        int m = in.nextInt();
        int alice_i;
        int alice_score;
        int ranks_i = dense_ranks.size()-1;

        for(alice_i = 0; alice_i < m; alice_i++) {

            alice_score = in.nextInt();

            while (ranks_i > 0 && alice_score > dense_ranks.get(ranks_i)) {

                ranks_i--;
            }

            if (alice_score >= dense_ranks.get(ranks_i)) {

                System.out.println(ranks_i + 1);

            } else {

                System.out.println(ranks_i + 2);
            }
        }
        in.close();
    }
}