public class TransformToSumTree {

    public void toSumTree(Node root) {
        if (root == null) {
            return;
        }

        int total = findSubTreeSum(root.left) + findSubTreeSum(root.right);
        root.val = total;

        toSumTree(root.left);
        toSumTree(root.right);
    }

    private int findSubTreeSum(Node r) {
        if (r == null) {
            return 0;
        }

        return r.val + findSubTreeSum(r.left) + findSubTreeSum(r.right);
    }
}
