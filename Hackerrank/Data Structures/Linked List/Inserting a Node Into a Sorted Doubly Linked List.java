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

Node SortedInsert(Node head,int data) {
    
    Node current = head;
    Node temp = new Node();
    temp.data = data;
    
    if (head == null) {
        return temp;
    }
    
    if (data <= head.data) {
        head.prev = temp;
        temp.next = head;
        return temp;
    }
    else {
        Node rem = SortedInsert(head.next, data);
        head.next = rem;
        rem.prev = head;
        return head;
    }
}
