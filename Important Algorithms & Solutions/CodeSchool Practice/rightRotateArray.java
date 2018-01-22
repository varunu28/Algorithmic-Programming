public class rightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rotateRight(arr);

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] rotateRight(int[] arr) {
        int prevVal = arr[0];
        for (int i=1;i<arr.length;i++) {
            int temp = arr[i];
            arr[i] = prevVal;
            prevVal = temp;
        }
        arr[0] = prevVal;
        return arr;
    }
}
