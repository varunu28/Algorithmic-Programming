import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/*
* Merge k iterators of sorted integers into one sorted stream with hasNext() and getNext() APIs. 
* Using a modified class to get the value on top of iterator for comparision in PriorityQueue. 
* */

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(2,2,3,3,5,6);
        List<Integer> l3 = Arrays.asList(1,1,2,3,3,4,5,6,6);

        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        Iterator<Integer> i3 = l3.iterator();

        Iterator[] iterators = {i1, i2, i3};

        MergeIterator mergeIterator = new MergeIterator(iterators);

        while (mergeIterator.hasNext()) {
            System.out.print(mergeIterator.getNext() + " ");
        }
    }
}

class MergeIterator {
    PriorityQueue<MyIterator> pq;

    public MergeIterator(Iterator[] iterators) {
        pq = new PriorityQueue<>();
        for (Iterator<Integer> iterator : iterators) {
            if (iterator.hasNext()) {
                pq.add(new MyIterator(iterator.next(), iterator));
            }
        }
    }

    public boolean hasNext() {
        return !pq.isEmpty();
    }

    public int getNext() {
        MyIterator temp = pq.poll();
        int num = temp.val;

        if (temp.hasNext()) {
            pq.add(temp);
        }

        return num;
    }
}

class MyIterator implements Comparable<MyIterator> {

    public int val;
    private Iterator<Integer> iterator;

    public MyIterator(int val, Iterator<Integer> iterator) {
        this.val = val;
        this.iterator = iterator;
    }

    public boolean hasNext() {
        if (iterator.hasNext()) {
            val = iterator.next();
            return true;
        }

        return false;
    }

    public int compareTo(MyIterator o) {
        return this.val - o.val;
    }
}
