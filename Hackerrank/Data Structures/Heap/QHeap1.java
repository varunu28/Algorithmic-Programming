import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Heap heap = new Heap();
        
        for (int i=0;i<n;i++) {
        	String[] strs = br.readLine().split("\\s+");
        	if (strs[0].equals("1")) {
        		heap.add(Integer.parseInt(strs[1]));
        	}
        	else if(strs[0].equals("2")) {
        		heap.delete(Integer.parseInt(strs[1]));
        	}
        	else {
        		System.out.println(heap.peek());
        	}
        }
    }
}

class Heap {
	ArrayList<Integer> list = new ArrayList<>();
	
	private int getLeftIndex(int idx) { return idx*2 + 1; }
	private int getRightIndex(int idx) { return idx*2 + 2; }
	private int getParentIndex(int idx) { return idx/2; }
	
	private boolean hasParent(int idx) { return idx/2 >= 0; }
	private boolean hasLeftChild(int idx) { return idx*2 + 1 < list.size(); }
	private boolean hasRightChild(int idx) { return idx*2 + 2 < list.size(); }
	
	private int getLeftChild(int idx) { return list.get(getLeftIndex(idx)); }
	private int getRightChild(int idx) { return list.get(getRightIndex(idx)); }
	private int getParent(int idx) { return list.get(getParentIndex(idx)); }
	
	public void add(int item) {
		list.add(item);
		heapifyUp();
	}
	
	private void swap(int idx1, int idx2) {
		int num = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, num);
	}
	
	public void heapifyUp() {
		int n = list.size()-1;
		while(hasParent(n) && list.get(n) < getParent(n)) {
			swap(n, getParentIndex(n));
			n = getParentIndex(n);
		}
	}
	
	public int peek() {
		return list.get(0);
	}
	
	private void heapifyDown() {
        int idx = 0;
        while (hasLeftChild(idx)) {
            int smallChildIdx = getLeftIndex(idx);
            if (hasRightChild(idx) && getRightChild(idx) < getLeftChild(idx)) {
                smallChildIdx = getRightIndex(idx);
            }

            if (list.get(idx) < list.get(smallChildIdx)) {
                break;
            }

            swap(idx, smallChildIdx);
            idx = smallChildIdx;
        }
    }
	
	public void delete(int item) {
		if (item == this.peek()) {
			list.set(0, list.get(list.size()-1));
			list.remove(list.size()-1);
			heapifyDown();
		}
		else {
			for (int i=0;i<list.size();i++) {
				if (list.get(i) == item) {
					list.remove(i);
					break;
				}
			}
		}
	}
}
