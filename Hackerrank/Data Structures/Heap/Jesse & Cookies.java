import java.io.*;
import java.util.*;

class MinHeap {

	private final int capacity = 2;
	private int[] heap;
	private int size;
	
	MinHeap() {
		heap = new int[capacity];
	}
	
	int size() {
		return size;
	}
	
	int[] toArray() {
		return heap;
	}
	void insert(int x) {
		if(size == heap.length) {
			doubleSize();
		}
		int pos = size++;
		heap[pos] = x;
		heapifyUp(pos);
	}

	private void heapifyUp(int pos) {
		while(pos >= 0 && heap[pos] < heap[parent(pos)]) {
			swap(pos,parent(pos));
			pos = parent(pos);
		}
	}

	private void swap(int pos, int parent) {
		int t = heap[pos];
		heap[pos] = heap[parent];
		heap[parent] = t;
	}

	private int parent(int pos) {
		return (pos-1)/2;
	}

	int deleteMin() {
		if(size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
        int x = heap[0];
		heap[0] = heap[--size];
		heapifyDown(0);
		return x;
	}
	
	void deleteElement(int x) {
		for(int i=0;i<size;i++) {
			if(heap[i] == x) {
				heap[i] = heap[--size];
				heapifyDown(i);
				break;
			}
		}
	}
	private void heapifyDown(int pos) {
		int left = left(pos);
		int right = right(pos);
		int smallest = pos;
		
		if(left < size && heap[left] < heap[smallest]) {
			smallest = left;
		}
		if(right < size && heap[right] < heap[smallest]){
			smallest = right;
		}
		if(smallest!=pos) {
			swap(smallest, pos);
			heapifyDown(smallest);
		}
	}

	private int right(int pos) {
		return 2*pos+2;
	}

	private int left(int pos) {
		return 2*pos+1;
	}

	private void doubleSize() {
		int[] oldHeap = heap;
		heap = new int[size*2];
		System.arraycopy(oldHeap, 0, heap, 0, size);
	}
	
	void print() {
		for(int i=0;i<size;i++) {
			System.out.print(heap[i] + " ");
		}
	}
	
	int min() {
		return heap[0];
	}
}

public class Solution {

    private static boolean heapElementsNotGreater(MinHeap heap, int k) {
		int size = heap.size();
		int[] arr = heap.toArray();
		for(int i=0;i<size;i++) {
			if(arr[i] < k) {
				return false;
			}
		}
		return true;
	}
    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		MinHeap heap = new MinHeap();
		for (int i = 0; i < n; i++) {
			heap.insert(sc.nextInt());
		}
		sc.close();
		int op = 0;
		while(op != -1 && !heapElementsNotGreater(heap,k)) {
			try {
				int cookie = 1 * heap.deleteMin() + 2 * heap.deleteMin();
				heap.insert(cookie);
				op++;
			} catch (ArrayIndexOutOfBoundsException ex) {
				op = -1;
			}
		}
        
		System.out.print(op);
    }
}
