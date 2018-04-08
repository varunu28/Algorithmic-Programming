package LinkedListProblems;

public class FrontBackSplit {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addNode(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);
        a.addNode(5);

        int n = a.getSize(a.head)%2 == 0 ? a.getSize(a.head)/2 : a.getSize(a.head)/2 + 1;
        int i = 0;
        Node curr = a.head;

        LinkedList front = new LinkedList();
        LinkedList back = new LinkedList();

        while (i<n) {
            front.addNode(curr.val);
            curr = curr.next;
            i++;
        }

        while (curr != null) {
            back.addNode(curr.val);
            curr = curr.next;
        }

        System.out.println("Initial list is as below: ");
        a.printLinkedList(a.head);

        System.out.println("Front list is as below: ");
        front.printLinkedList(front.head);

        System.out.println("Back list is as below: ");
        back.printLinkedList(back.head);
    }

}
