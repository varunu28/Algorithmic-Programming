import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] arr) {
        // Fill up this function
        int n = arr.length;
         for (int i=0;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                for (int k=0;k<n;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            arr[j+1] = key;
        }
        for (int k=0;k<n;k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
