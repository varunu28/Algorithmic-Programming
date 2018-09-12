public class FindMinValueInBST {

    public int minValue(Node root) {
            if (root.left == null) {
                return root.val;
            }

            return minValue(root.left);
    }
}

