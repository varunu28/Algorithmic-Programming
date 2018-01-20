// Find number of occurences of a number in a sorted array using binary search
// O(logN)

public class Solution {
    
    public static void main(String[] args) {
        
        int[] arr = {1,1,3,3,3,5,5,5,5,9,9,11};
        int target = 5;
        
        System.out.println(countOcc(arr, target));
        
    }
    
    private static int countOcc(int[] arr, int target) {
        int last = lastOcc(arr, target);
        int first = firstOcc(arr, target);
        
        return last != -1 ? last - first + 1 : 0;
    }
    
    private static int firstOcc(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        
        while (low <= high) {
            int mid = (low + high)/2;
            
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return res;
    }
    
    private static int lastOcc(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        
        while (low <= high) {
            int mid = (low + high)/2;
            
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return res;
    }
}