public class SearchInRotatedSortedArray {

    public int findElement(int[] arr, int element) {
        int pivotIndex = findPivot(arr, 0, arr.length-1);

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                pivotIndex = i;
                break;
            }
        }

        int startFirst = 0;
        int endFirst = pivotIndex;
        int startSecond = pivotIndex+1;
        int endSecond = arr.length-1;

        if (arr[startFirst] <= element) {
            return findElementBS(arr, startFirst, endFirst, element);
        }
        else {
            return findElementBS(arr, startSecond, endSecond, element);
        }
    }

    private int findPivot(int arr[], int low, int high) {
        if (high < low) {
            return -1;
        }
        
        if (high == low) {
            return low;
        }

        int mid = (low + high)/2;
        
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return (mid-1);
        }
        
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid-1);
        }
        
        return findPivot(arr, mid + 1, high);
    }

    private int findElementBS(int[] arr, int startFirst, int endFirst, int element) {
        if (startFirst > endFirst) {
            return -1;
        }

        int mid = (startFirst+endFirst)/2;

        if (arr[mid] == element) {
            return mid;
        }
        else if (arr[mid] < element) {
            return findElementBS(arr, mid+1, endFirst, element);
        }
        else {
            return findElementBS(arr, startFirst, mid-1, element);
        }
    }
}

