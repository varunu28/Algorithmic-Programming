public class LowestCommonAncestorBST {

    public Node lca(Node root, int n1, int n2) {
        if ((n1 < root.val && n2 > root.val) ||
            (n1 > root.val && n2 < root.val)) {

            return root;
        }
        if (root.val > n1 && root.val > n2) {
            return lca(root.left, n1, n2);
        }
        if (root.val < n1 && root.val < n2) {
            return lca(root.right, n1, n2);
        }

        if (root.val == n1 || root.val == n2) {
            return root;
        }

        return null;
    }
}
