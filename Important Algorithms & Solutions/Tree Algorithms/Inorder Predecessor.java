public class Solution {

    public static void main (String... args) {

        final int[] arr = {5, 10, 14, 15, 16, 32, 35, 36, 37, 40, 45, 50, 75, 78, 79, 81, 82, 85, 87, 90, 100};

        TreeNode root = convertToBST(arr, 0, arr.length-1);
        inorderTraversal(root);

        System.out.println();

        final int num = 5;
        System.out.println(inorderPredecessor(root, num));
    }

    public static int inorderPredecessor(TreeNode root, int n) {

        TreeNode treeNode = root;
        TreeNode node = findNode(treeNode, n);

        if (node.left != null) {
            node = node.left;

            while (node.right != null) {
                node = node.right;
            }

            return node.val;
        }
        else {
            TreeNode lastRight = null;

            while (treeNode.val != node.val) {
                if (treeNode.val > node.val) {
                    treeNode = treeNode.left;
                }
                else {
                    lastRight = treeNode;
                    treeNode = treeNode.right;
                }
            }

            if (lastRight != null) {
                return lastRight.val;
            }
            else {
                return -1;
            }
        }
    }

    public static TreeNode findNode(TreeNode root, int n) {

        TreeNode treeNode = root;

        while (treeNode != null) {

            if (treeNode.val == n) {
                return treeNode;
            }
            else if (treeNode.val > n) {
                treeNode = treeNode.left;
            }
            else {
                treeNode = treeNode.right;
            }
        }

        return null;
    }

    public static TreeNode convertToBST(int[] arr, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end)/2;

        TreeNode root = new TreeNode(arr[mid]);
        root.left = convertToBST(arr, start, mid-1);
        root.right = convertToBST(arr, mid+1, end);

        return root;
    }

    public static void inorderTraversal(TreeNode root) {

        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);

    }
}