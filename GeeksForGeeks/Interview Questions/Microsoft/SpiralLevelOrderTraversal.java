import java.util.*;

public class SpiralLevelOrderTraversal {

    public void printSpiral(Node node) {
        List<List<Integer>> lists = zigzagLevelOrder(node);

        for (List<Integer> list : lists) {
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
    }

    private List<List<Integer>> zigzagLevelOrder(Node node) {
        List<List<Integer>> lists = new ArrayList<>();
        if (node == null) return lists;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();

            while (len-- > 0) {
                Node t = queue.remove();
                temp.add(t.val);

                if (t.left != null) {
                    queue.add(t.left);
                }

                if (t.right != null) {
                    queue.add(t.right);
                }
            }

            if (flag) {
                Collections.reverse(temp);
            }
            lists.add(temp);
            flag = !flag;
        }

        return lists;
    }
}
