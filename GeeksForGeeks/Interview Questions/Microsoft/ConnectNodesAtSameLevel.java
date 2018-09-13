import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {

    public void connect(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(queue.peek() != null) {
            Node popped = queue.remove();
            popped.nextRight = queue.peek();

            if (popped.left != null) {
                queue.add(popped.left);
            }

            if (popped.right != null) {
                queue.add(popped.right);
            }

            if (queue.peek() == null) {
                queue.remove();
                queue.add(null);
            }
        }
    }
}
