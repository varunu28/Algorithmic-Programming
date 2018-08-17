/*Given an array of integers of size N. Assume ‘0’ as invalid number and all other as valid number. Write a program that
modifies the array in such a way that if next number is  valid number and is same as current number, double the current
number value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are
shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.*/

public class EaseTheArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        easeArrayImpl(arr);
    }

    private static void easeArrayImpl(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i+1] != 0 && arr[i] == arr[i+1]) {
                arr[i] *= 2;
                arr[i+1] = 0;
            }
        }

        int slow = 0;
        int fast = 0;

        while (fast < arr.length) {
            if (arr[fast] != 0) {
                arr[slow++] = arr[fast++];
            }
            else {
                fast++;
            }
        }

        while (slow < arr.length) {
            arr[slow++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
