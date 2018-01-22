// Finds if an array has a pair with a given sum with O(N) complexity

import java.util.ArrayList;

public class pairWithSum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,9};
        int[] arr2 = {1,2,3,4,4};
        int[] arr3 = {4,32,13,7,65,7,3,54,5};
        int sum = 8;

        System.out.println(hasPair(arr1, sum)); // Returns false
        System.out.println(hasPair(arr2, sum)); // Returns true
        System.out.println(hasPair(arr3, sum)); // Returns true
    }

    static boolean hasPair(int[] arr, int sum) {
        ArrayList<Integer> compArr = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (compArr.indexOf(arr[i]) != -1) {
                return true;
            }
            compArr.add(sum-arr[i]);
        }
        return false;
    }
}
