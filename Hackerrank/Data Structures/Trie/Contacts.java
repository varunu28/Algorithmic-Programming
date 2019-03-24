import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Node {
    char val;
    Map<Character, Node> childrens;
    int size;

    public Node(char val) {
        this.val = val;
        childrens = new HashMap<>();
        size = 0;
    }
}

public class Solution {

    /*
     * Complete the contacts function below.
     */
    static int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */
        Node root = new Node(' ');
        List<Integer> ans = new ArrayList<>();

        for (String[] query : queries) {
            if (query[0].equals("add")) {
                addWord(root, query[1], 0);
            }
            else {
                ans.add(getWordCount(root, query[1]));
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    private static int getWordCount(Node root, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (root.childrens.containsKey(s.charAt(i))) {
                root = root.childrens.get(s.charAt(i));
            }
            else {
                return 0;
            }
        }

        return root.size;
    }

    private static void addWord(Node root, String s, int idx) {
        if (idx == s.length()) {
            return;
        }

        if (!root.childrens.containsKey(s.charAt(idx))) {
            root.childrens.put(s.charAt(idx), new Node(s.charAt(idx)));
        }

        root = root.childrens.get(s.charAt(idx));
        root.size++;

        addWord(root, s, idx + 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

