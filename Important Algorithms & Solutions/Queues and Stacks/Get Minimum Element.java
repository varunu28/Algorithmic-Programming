class GfG {
    int minEle = Integer.MAX_VALUE;
    Stack<Element> s = new Stack<>();
    
    int getMin() {
        if (s.isEmpty()) return -1;
        return s.peek().currMin;
    }
    
    int pop() {
        if (s.isEmpty()) return -1;
		Element element = s.pop();
		if (s.isEmpty()) {
		    minEle = Integer.MAX_VALUE;
		}
		else if (element.num == minEle) {
		    minEle = s.peek().currMin;
		}
		
		return element.num;
    }
    
    void push(int x) {
		minEle = Math.min(minEle, x);
		Element element = new Element(x, minEle);
		s.push(element);
    }	
}

class Element {
    public int num;
    public int currMin;
    
    public Element(int num, int currMin) {
        this.num = num;
        this.currMin = currMin;
    }
}
