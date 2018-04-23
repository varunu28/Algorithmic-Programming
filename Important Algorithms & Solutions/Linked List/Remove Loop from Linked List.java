/*Complete The function
Node is as follows:
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG{
    int removeTheLoop(Node node) {
        Node slow = node;
        Node fast = node;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                removeNode(slow, node);
                return 1;
            }
        }
        
        return 0;
    }
    
    void removeNode(Node loop, Node curr) {
        Node p1 = null;
        Node p2 = null;
        
        p1 =  curr;
        while(true) {
            p2 = loop;
            while (p2.next != loop && p2.next != p1) {
                p2 = p2.next;
            }
            
            if (p2.next == p1) {
                break;
            }
            
            p1 = p1.next;
        }
        
        p2.next = null;
    }
}
