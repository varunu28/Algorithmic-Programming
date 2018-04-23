/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG {
    boolean isPalindrome(Node head) {
        int l = getLength(head);
        int half = l/2 ;
        
        Node curr = head;
        int count = 1;
        
        while (count < half) {
            curr = curr.next;
            count++;
        }
        
        Node secHalf = getReverse(curr.next);
        curr.next = null;
        Node revHead = head;

        while (secHalf != null && revHead != null) {
            if (secHalf.data != revHead.data) {
                return false;
            }
            
            secHalf = secHalf.next;
            revHead = revHead.next;
        }
        
        return true;
    }   
    
   int getLength(Node head) {
       int len = 0;
       while (head != null) {
           len++;
           head = head.next;
       }
       
       return len;
   }
    
    Node getReverse(Node head) {
        
        Node prev = null;
        Node next = null;
        
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
