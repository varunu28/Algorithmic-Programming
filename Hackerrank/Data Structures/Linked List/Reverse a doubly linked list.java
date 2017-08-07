/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node tempPrev = null;
    Node current = head;
    Node tempNext = null;
    Node next = null;
    
    while (current != null) {
        next = current.next;
        current.next = tempPrev;
        tempPrev = current;
        current.prev = next;
        current = next;
    }
    
    head = tempPrev;
    return head;
}

