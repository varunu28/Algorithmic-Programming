import java.util.*;

public class TreeLookUp {

    public static void main(String[] args) throws Exception {

        Node tree = new Node(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(-1);
        tree.insert(29);
        tree.insert(93);
        tree.insert(6);
        tree.insert(0);
        tree.insert(-5);
        tree.insert(-6);
        tree.insert(-8);
        tree.insert(-1);

        // Print a level order traversal of the tree
        tree.printLevelOrder();
        System.out.println();
        
        int numToFind = -15;
        System.out.println(numToFind + " is present in the tree: " + tree.isPresent(numToFind));
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void printLevelOrder() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.print(n.data + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public boolean isPresent(int num) {
        return isPresent(this, num);
    }

    private boolean isPresent(Node root, int num) {

        if (root == null) return false;

        if (root.data == num) {
            return true;
        }
        else if (root.data > num) {
            return isPresent(root.left, num);
        }
        else {
            return isPresent(root.right, num);
        }
    }
}
