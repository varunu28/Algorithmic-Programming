import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInWindow {

    public void countDistinct(int[] arr, int window, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<window; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");

        for (int i=1; i<n-window+1; i++) {
            map.put(arr[i+window-1], map.getOrDefault(arr[i+window-1], 0) + 1);
            map.put(arr[i-1], map.getOrDefault(arr[i-1], 0) - 1);
            if (map.get(arr[i-1]) == 0) {
                map.remove(arr[i-1]);
            }

            System.out.print(map.size() + " ");
        }
    }
}

