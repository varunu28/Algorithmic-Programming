public class FindTransitionPoint {

    int transitionPoint(int arr[],int n) {
        return transitionPointImpl(arr, 0, n-1);
    }

    private int transitionPointImpl(int[] arr, int start, int end) {
        if (start > end) return -1;

        int mid = (start + end)/2;

        if (arr[mid] == 1) {
            if (mid > 0) {
                if (arr[mid-1] == 0) {
                    return mid;
                }
                else {
                    return transitionPointImpl(arr, start, mid-1);
                }
            }
            else {
                return 1;
            }
        }

        return transitionPointImpl(arr, mid + 1, end);
    }
}

