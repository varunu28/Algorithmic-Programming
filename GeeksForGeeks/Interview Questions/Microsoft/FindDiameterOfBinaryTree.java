public class FindDiameterOfBinaryTree {

    public int findDiameter(Node root) {
        if (root == null) return 0;

        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);

        int lDiameter = findDiameter(root.left);
        int rDiameter = findDiameter(root.right);

        return Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter));
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
