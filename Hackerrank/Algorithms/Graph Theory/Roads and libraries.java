import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static List<List<Integer>> adj;
    private static boolean[] visited;
    private static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();

            adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            visited = new boolean[n];

            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                adj.get(city_1 - 1).add(city_2 - 1);
                adj.get(city_2 - 1).add(city_1 - 1);
            }

            System.out.println(roadsAndLibraries(x, y));
        }

        in.close();
    }

    private static long roadsAndLibraries(int x, int y) {
        long cost = 0;

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i);
                if (x > y) {
                    cost += x + y * (count - 1);
                } else {
                    cost += x * count;
                }
            }
        }

        return cost;
    }

    private static void dfs(int i) {
        visited[i] = true;
        count++;

        List<Integer> list = adj.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (!visited[list.get(j)]) {
                dfs(list.get(j));
            }
        }
    }
}
