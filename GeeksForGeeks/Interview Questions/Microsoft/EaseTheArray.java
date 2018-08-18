/*Given an array of integers of size N. Assume ‘0’ as invalid number and all other as valid number. Write a program that
modifies the array in such a way that if next number is  valid number and is same as current number, double the current
number value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are
shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EaseTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];

            for (int i=0; i<strs.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            easeArrayImpl(arr);
        }
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

        for (int i=0; i<arr.length; i++) {
            if (i<slow) {
                System.out.print(arr[i] + " ");
            }
            else {
                System.out.print(0 + " ");
            }
        }

        System.out.println();
    }
}

