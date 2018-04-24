/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below class */
class LRUCache {
 
    /*Inititalize an LRU cache with size N */
    Map<Integer, Integer> map;
    Deque<Integer> deque;
    int N;
    
    public LRUCache(int N) {
       //Your code here
       map = new HashMap<>();
       deque = new LinkedList<>();
       this.N = N;
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
       //Your code here
       if (map.get(x) != null) {
           int val = map.get(x);
           deque.remove(x);
           deque.addFirst(x);
           
           return val;
       }
       
       return -1;
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
        if (map.containsKey(x)) {
            int val = map.get(x);
            deque.remove(x);
            map.put(x, y);
            deque.addFirst(x);
        }      
        else {
            if (deque.size() != this.N) {
                deque.addFirst(x);
                map.put(x,y);
            }
            else {
                int val = deque.removeLast();
                map.remove(val);
                deque.addFirst(x);
                map.put(x,y);
            }
        }
    }
}
