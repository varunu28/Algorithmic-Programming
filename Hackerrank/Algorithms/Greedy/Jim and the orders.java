import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] orderTime = new int[n];
        int[] timeItTakes = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            String[] strs = br.readLine().trim().split("\\s+");
            orderTime[i] = Integer.parseInt(strs[0]);
            timeItTakes[i] = Integer.parseInt(strs[1]);
            map.put(i+1, orderTime[i] + timeItTakes[i]);
        }
        Map<Integer, Integer> map1 = sortByValues((HashMap) map);
        Set set2 = map1.entrySet();
        Iterator iterator2 = set2.iterator();

        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + " ");
        }
    }

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
