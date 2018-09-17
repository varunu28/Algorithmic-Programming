class TwoStack {
	int size;
	int top1,top2;
	int arr[] = new int[100];
	TwoStack() {
		size = 100;
		top1 = -1;
		top2 = size;
	}
}

class ImplementTwoStackInAnArray {

    void push1(int x, TwoStack sq) {
        sq.top1++;
        sq.arr[sq.top1] = x;
    }
    
    void push2(int x, TwoStack sq) {
        sq.top2--;
        sq.arr[sq.top2] = x;
    }

    int pop1(TwoStack sq) {
        if (sq.top1 == -1) {
            return -1;
        }
        
        int num = sq.arr[sq.top1];
        sq.arr[sq.top1] = 0;
        sq.top1--;
        
        return num;
    }

    int pop2(TwoStack sq) {
        if (sq.top2 == 100) {
            return -1;
        }
        
        int num = sq.arr[sq.top2];
        sq.arr[sq.top2] = 0;
        sq.top2++;
        
        return num;
    }
}

