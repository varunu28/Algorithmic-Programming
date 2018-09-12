public class MirrorTree {

    public void mirror(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        Node temp = root.right;
        root.right = root.left;
        root.left = temp;

        mirror(root.left);
        mirror(root.right);
    }
}

