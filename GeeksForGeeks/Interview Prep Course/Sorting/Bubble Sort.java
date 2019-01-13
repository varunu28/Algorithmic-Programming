class GfG {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
