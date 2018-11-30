class StackNode {
	int data;
	StackNode next;
}

class Stack_using_LinkedList {
	 StackNode top;
}

class GfG {
	/* The method push to push element into the stack */
    void push(int a,Stack_using_LinkedList ob) {
        StackNode curr = new StackNode();
        curr.data = a;
        curr.next = null;
        
        if (ob.top == null) {
            ob.top = curr;
        }
        else {
            curr.next = ob.top;
            ob.top = curr;
        }
	}
    /*The method pop which return the element poped out of the stack*/
	int pop(Stack_using_LinkedList ob) {
		//Your code here
		StackNode curr = ob.top;
		if (curr == null) {
		    return -1;
		}
		
		int data = ob.top.data;
		ob.top = ob.top.next;
		
		return data;
	}
	
}
