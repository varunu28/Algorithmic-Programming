import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main (String... args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = convertToBST(arr, 0, arr.length-1);

        breadthFirstTraversal(root);
    }

    public static void breadthFirstTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            System.out.print(node.val + " ");
        }
    }
}