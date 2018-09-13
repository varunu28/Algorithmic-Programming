import java.util.*;

public class ReverseLevelOrder {

    public void reversePrint(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return;
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 1;

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            while (size-- > 0) {
                Node temp = queue.remove();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

                list.add(temp.val);
            }

            map.put(count, list);
            count++;
        }

        for (int i=count-1; i>0; i--) {
            List<Integer> list = map.get(i);
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
