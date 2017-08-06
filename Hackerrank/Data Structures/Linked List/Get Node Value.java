/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    int index = 0;
    Node current = head;
    Node result = head;
    while(current!=null)
    {
        current=current.next;
        if (index++ > n)
        {
            result=result.next;
        }
    }
    return result.data;
}
