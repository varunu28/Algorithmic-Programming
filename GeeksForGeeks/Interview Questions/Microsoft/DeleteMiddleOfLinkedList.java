public class DeleteMiddleOfLinkedList {

    public Node Delete(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        int count = 1;
        int midLen = findLength(head)/2;
        Node curr = head;

        while (count < midLen) {
            curr = curr.next;
            count++;
        }

        curr.next = curr.next.next;

        return head;
    }

    private int findLength(Node head) {
        int count = 0;

        while (head != null) {
            head = head.next;
            count++;
        }

        return count;
    }
}

