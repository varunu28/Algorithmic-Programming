import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnionTwoLinkedList {

    public Node findUnion(Node head1, Node head2) {
        SortedSet<Integer> set = new TreeSet<>();

        while (head1 != null) {
            set.add(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            set.add(head2.value);
            head2 = head2.next;
        }

        Iterator iterator = set.iterator();
        Node head = new Node(0);
        Node curr = head;

        while (iterator.hasNext()) {
            curr.next = new Node((Integer) iterator.next());
            curr = curr.next;
        }

        return head.next;
    }

    public Node findUnionSimpleImpl(Node head1, Node head2) {
        int[] count = new int[1001];

        while (head1 != null) {
            if (count[head1.value] == 0) {
                count[head1.value]++;
            }

            head1 = head1.next;
        }

        while (head2 != null) {
            if (count[head2.value] == 0) {
                count[head2.value]++;
            }

            head2 = head2.next;
        }

        Node head = new Node(0);
        Node curr = head;

        for (int i=0; i<1001; i++) {
            if (count[i] != 0) {
                curr.next = new Node(i);
                curr = curr.next;
            }
        }

        return head.next;
    }
}

