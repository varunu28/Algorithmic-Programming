public class MaxPathSum {

    int maxValue;

    public int findMaxPathSum(Node root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    private int maxPathDown(Node root) {
        if (root == null) return 0;
        int left = Math.max(0, maxPathDown(root.left));
        int right = Math.max(0, maxPathDown(root.right));

        maxValue = Math.max(maxValue, left + right + root.val);

        return Math.max(left, right) + root.val;
    }
}

