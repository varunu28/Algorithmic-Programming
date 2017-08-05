/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node tmp = new Node();
    tmp.data = x;
    
    if (head == null) {
        head = tmp;
        tmp.next = null;
        return head;
    }
    tmp.next = head;
    head = tmp;
    return head;
}
