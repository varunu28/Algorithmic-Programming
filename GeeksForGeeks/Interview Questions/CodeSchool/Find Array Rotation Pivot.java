// Find number of times a sorted array with no duplicats is rotated anti-clockwise
// O(logN)
// Tip: Find index of minimum element

public class Solution {
    
    public static void main(String[] args) {
        
        int[] arr = {8, 11, 12, 2, 3, 5};
        
        System.out.println(findRotations(arr));
        
    }
    
    private static int findRotations(int[] arr) {
        
        int n = arr.length - 1;
        int low = 0;
        int high = n;
        
        while (low < high) {

            if (arr[low] <= arr[high]) return low;
            
            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }
            else if (arr[mid] <= arr[high]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
}