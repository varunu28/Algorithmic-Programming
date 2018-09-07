public class MaximumDepth {

    public int findMaxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

