import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/*
 * Merging multiple streams into one main stream in a sorted order
 */
public class Solution {
	
	public static void main(String[] args) {
	
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(-2,-1,0);
		List<Integer> list3 = Arrays.asList(6,7,8,9);
		
		Iterator<Integer> iter1 = list1.iterator();
		Iterator<Integer> iter2 = list2.iterator();
		Iterator<Integer> iter3 = list3.iterator();
		
		MainStream stream = new MainStream();
		stream.addIter(iter1);
		stream.addIter(iter2);
		stream.addIter(iter3);
		
		while(stream.hasNext()) {
			System.out.println(stream.getNext());
		}
	}
}

class MainStream {
	
	private PriorityQueue<Integer> queue;
	Map<Iterator<Integer>, Integer> map = new HashMap<>();
	
	public MainStream() {
		queue = new PriorityQueue<>();
	}
	
	public void addIter(Iterator<Integer> it) {
		if (it.hasNext()) {
			int num = it.next();
			map.put(it, num);
			queue.add(num);
		}
	}
	
	public boolean hasNext() {
		return !queue.isEmpty();
	}
	
	public int getNext() {
		int num = queue.poll();
		
		for (Entry<Iterator<Integer>, Integer> entry : map.entrySet()) {
			if (entry.getValue() == num) {
				if (entry.getKey().hasNext()) {
					int temp = entry.getKey().next();
					map.put(entry.getKey(), temp);
					queue.add(temp);
					break;
				}
			}
		}
		
		return num;
	}
}
