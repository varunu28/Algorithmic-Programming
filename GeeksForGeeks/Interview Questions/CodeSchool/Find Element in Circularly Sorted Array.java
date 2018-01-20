// Find an element in a circularly sorted array
// O(logN)

public class Solution {
    
    public static void main(String[] args) {
        
        int[] arr = {12, 14, 18, 21, 3, 6, 8, 9};
        int target = 12;
        
        System.out.println(circularArraySearch(arr, target));
        
    }
    
    private static int circularArraySearch(int[] arr, int target) {
        
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] <= arr[high]) { 
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low =  mid + 1;
                }
            }
        }
        
        return -1;
    }
}