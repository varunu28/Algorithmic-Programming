import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public void printLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();

            while (n-- > 0) {
                Node temp = queue.remove();
                System.out.print(temp.val + " ");

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            System.out.println();
        }
    }
}
