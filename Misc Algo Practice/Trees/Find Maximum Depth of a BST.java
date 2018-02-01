public class Solution {

    public static void main (String... args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        TreeNode root = convertToBST(arr, 0, arr.length-1);

        System.out.println(findMaxDepth(root));
    }

    public static int findMaxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
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