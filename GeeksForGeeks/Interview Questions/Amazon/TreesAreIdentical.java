public class TreesAreIdentical {
    public boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if ((root1 == null && root2 != null) ||
            (root1 != null && root2 == null) ||
            (root1.val != root2.val)) {
            return false;
        }

        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
}

