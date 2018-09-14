public class DeleteNodesGreaterThanK {

    public Node deleteNode(Node root, int x) {

        if (root == null) {
            return null;
        }

        root.left = deleteNode(root.left, x);
        root.right = deleteNode(root.right, x);

        if (root.val >= x) {
            Node lChild = root.left;
            root = null;
            return lChild;
        }

        return root;
    }
}

