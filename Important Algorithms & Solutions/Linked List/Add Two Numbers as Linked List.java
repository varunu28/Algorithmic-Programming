/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG {
	Node addTwoLists(Node first, Node second) {
	    if (first == null && second == null) return null;
	    if (first == null && second != null) return second;
	    if (first != null && second == null) return first;
	    
	    Node newNode = new Node(0);
	    Node curr = newNode;
	    int carry = 0;
	    
	    while (first != null || second != null) {
	        int temp;
	        if (first != null && second != null) {
	            temp = first.data + second.data + carry;
	            
	            first = first.next;
	            second = second.next;
	        }
	        else if (first != null && second == null) {
	            temp = first.data + carry;
	            first = first.next;
	        }
	        else {
	            temp = second.data + carry;
	            second = second.next;
	        }
	        
	        carry = temp/10;
            temp = temp%10;
            
            curr.next = new Node(temp);
	        curr = curr.next;
	    }
	    
	    if (carry != 0) {
	        curr.next = new Node(carry);
	        curr = curr.next;
	    }
	    
	    return newNode.next;
	}
}
