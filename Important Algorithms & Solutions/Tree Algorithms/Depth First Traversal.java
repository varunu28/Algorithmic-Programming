// Depth first traversal of a binary tree
// Print the Node => Visit Left => Visit Right

public class Solution {

    public static void main (String... args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = convertToBST(arr, 0, arr.length-1);
        
        depthFirstTraversal(root);
    }

    public static void depthFirstTraversal(TreeNode root) {
        
        if (root != null) {
            System.out.print(root.val + " ");
        }

        if (root.left != null) {
            depthFirstTraversal(root.left);
        }
        if (root.right != null) {
            depthFirstTraversal(root.right);
        }
    }
}