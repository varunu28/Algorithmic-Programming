import java.util.LinkedList;
import java.util.Queue;

public class OddEvenLevelDifference {

    public int getLevelDiff(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int evenSum = 0;
        int oddSum = 0;
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                Node temp = queue.remove();
                if (level%2 == 0) {
                    evenSum += temp.val;
                } else {
                    oddSum += temp.val;
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            level++;
        }

        return oddSum - evenSum;
    }
}

