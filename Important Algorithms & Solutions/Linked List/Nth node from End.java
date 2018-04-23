/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class GfG {
    int getNthFromLast(Node head, int n) {
        Node curr = head;
        while (n>0) {
            curr = curr.next;
            n--;
        }
        
        while (curr != null) {
            head = head.next;
            curr = curr.next;
        }
        
        return head.data;
    }
}
