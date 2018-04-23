/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class gfg {
    Node MergeLists(Node headA, Node headB) {
        if (headA == null && headB == null) return null;
        if (headA != null && headB == null) return headA;
        if (headA == null && headB != null) return headB;
        
        Node newNode = new Node(0);
        Node curr = newNode;
        
        while (headA != null || headB != null) {
            if (headA != null && headB != null) {
                if (headA.data > headB.data) {
                    curr.next = new Node(headB.data);
                    headB = headB.next;
                }
                else {
                    curr.next = new Node(headA.data);
                    headA = headA.next;
                }
            }
            else if (headA != null && headB == null) {
                curr.next = new Node(headA.data);
                headA = headA.next;
            }
            else {
                curr.next = new Node(headB.data);
                headB = headB.next;
            }
            
            curr = curr.next;
        }
        
        return newNode.next;
    } 
}
