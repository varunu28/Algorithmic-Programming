package LinkedListProblems;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addNode(1);
        a.addNode(1);
        a.addNode(2);
        a.addNode(2);
        a.addNode(4);
        a.addNode(5);
        a.addNode(5);

        System.out.println("Initial list is as below:");
        a.printLinkedList(a.head);

        Node curr = a.head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }

        System.out.println("List after removing duplicates is as below:");
        a.printLinkedList(a.head);
    }

}
