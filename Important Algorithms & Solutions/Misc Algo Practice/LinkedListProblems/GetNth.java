package LinkedListProblems;

/*Write a GetNth() function that takes a linked list and an integer index and returns the data value stored
  in the node at that index position. GetNth() uses the C numbering convention that the first node is index
  0, the second is index 1, ... and so on. So for the list {42, 13, 666} GetNth() with index 1 should
  return 13. The index should be in the range [0..length-1]. If it is not, GetNth() should assert() fail
  (or you could implement some other error case strategy).
*/

public class GetNth {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(8);
        linkedList.addNode(32);
        linkedList.addNode(4);
        linkedList.addNode(24);
        linkedList.addNode(13);

        int idx = 4;
        int ans = findAtNth(linkedList.head, idx);

        System.out.println(ans == -1 ? "Invalid index" : ans);

    }

    public static int findAtNth (Node head, int idx) {

        int i = 0;
        while (head != null) {

            if (i == idx) {
                break;
            }

            head = head.next;
            i++;
        }

        return head == null ? -1 : head.val;
    }
}
