import java.util.Map;
import java.util.TreeMap;

public class IntersectionOfTwoLinkedList {

    public Node findIntersection(Node node1, Node node2) {
        Map<Integer, Boolean> map = new TreeMap<>();

        while (node1 != null) {
            if (!map.containsKey(node1.value)) {
                map.put(node1.value, true);
            }

            node1 = node1.next;
        }

        while (node2 != null) {
            if (map.containsKey(node2.value)) {
                map.put(node2.value, false);
            }

            node2 = node2.next;
        }

        Node ans = new Node(-1);
        Node curr = ans;

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                curr.next = new Node(entry.getKey());
                curr = curr.next;
            }
        }

        return ans.next;
    }
}

