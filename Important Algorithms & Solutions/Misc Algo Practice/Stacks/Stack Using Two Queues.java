class GfG {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop() {
	    int count = 0;
	    while (!q1.isEmpty()) {
	        int num = q1.remove();
	        q2.add(num);
	        count++;
	    }
	    
	    if (count == 0) return -1;
	    
	    while (count > 1) {
	        q1.add(q2.remove());
	        count--;
	    }
	    
	    return q2.remove();
    }
	
    /* The method push to push element into the stack */
    void push(int a) {
        q1.add(a);
    }
}
