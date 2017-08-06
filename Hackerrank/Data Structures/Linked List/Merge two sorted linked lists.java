/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    if((headA==null)&&(headB==null))
        return null;
    
    if((headA!=null)&&(headB==null))
        return headA;
    
    if((headA == null)&&(headB!=null))
        return headB;
    
    if(headA.data < headB.data)
        headA.next = mergeLists(headA.next, headB);
    else if(headA.data > headB.data) {
        Node temp = headB;
        headB = headB.next;
        temp.next = headA;
        headA = temp;
        headA.next = mergeLists(headA.next, headB);
    }
    
    return headA;
}
