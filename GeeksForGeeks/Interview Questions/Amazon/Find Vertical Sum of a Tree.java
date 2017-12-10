import java.util.HashMap;
import java.util.Map;

public class VerticalSum {

    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;

        n2.left = new TreeNode(4);
        n2.right = new TreeNode(5);

        n3.left = new TreeNode(7);
        n3.right = new TreeNode(6);

        System.out.println(findVerticalSum(n1, 5));
    }

    public static int findHeight(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }

    public static int findVerticalSum(TreeNode root, int col) {
        fillMap(root, 0);

        return map.get(col - findHeight(root));
    }

    public static void fillMap(TreeNode root, int pos) {
        if (root == null) return;

        map.put(pos, map.getOrDefault(pos, 0) + root.value);

        fillMap(root.left, pos-1);
        fillMap(root.right, pos+1);
    }

}
