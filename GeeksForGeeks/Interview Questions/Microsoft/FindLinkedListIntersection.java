class FindLinkedListIntersection {
    
    public int intersectPoint(Node headA, Node headB) {
	    Node temp = headA;
	    
	    while (temp != null) {
	        temp.data = temp.data*(-1);
	        temp = temp.next;
	    }
	    
	    temp = headB;
	    
	    while (temp != null) {
	        if (temp.data < 0) {
	            return temp.data*(-1);
	        }
	        
	        temp = temp.next;
	    }
	    
	    return -1;
	}
}
