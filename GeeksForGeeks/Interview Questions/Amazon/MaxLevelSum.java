import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {

    public int findMaxLevelSum(Node root) {
        if (root == null) return 0;
        int maxSum = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int tempSum = 0;
            while (size -- > 0) {
                Node tempNode = queue.remove();
                tempSum += tempNode.val;

                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }

            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }
}

