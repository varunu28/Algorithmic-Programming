public class CountLeaves {

    public int getLeaveCount(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }

        return getLeaveCount(root.left) + getLeaveCount(root.right);
    }
}

