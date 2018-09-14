import java.util.Set;
import java.util.TreeSet;

public class FindUnionOfLinkedLists {

    public Node findUnion(Node node1, Node node2) {
        Set<Integer> set = new TreeSet<>();

        while (node1 != null) {
            set.add(node1.data);
            node1 = node1.next;
        }

        while (node2 != null) {
            set.add(node2.data);
            node2 = node2.next;
        }

        Node ans = new Node(-1);
        Node curr = ans;

        for (int num : set) {
            curr.next = new Node(num);
            curr = curr.next;
        }

        return ans.next;
    }
}
