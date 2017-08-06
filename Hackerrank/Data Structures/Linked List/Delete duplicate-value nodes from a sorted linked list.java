/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if (head == null) {
        return head;
    }
    Node current = head;
    while (true) {
        if (current.next == null) {
            break;
        }
        if (current.data == current.next.data) {
            current.next = current.next.next;
        }
        else {
            current = current.next;
        }
    }
    return head;
}
