import java.util.*;

// Find last and first occurence of a number in a sorted array using binary search
// O(logN)

public class Solution {
    
    public static void main(String[] args) {
        
        int[] arr = {2,4,10,10,10,18,20};
        int n = arr.length;
        
        System.out.println(firstOcc(arr, 10));
        System.out.println(lastOcc(arr, 10));
        
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