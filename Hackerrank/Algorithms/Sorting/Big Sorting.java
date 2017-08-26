import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here

        String[] temp = new String[n];
        
        MS(unsorted, temp, 0, n-1);
        
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++) {
            System.out.println(unsorted[unsorted_i]);
        }
    }
    
    public static void MS(String[] arr, String[] temp, int start, int end) {
        if (start < end) {
            int mid = start + (end - start)/2;
            MS(arr, temp, start, mid);
            MS(arr, temp, mid+1, end);
            merge(arr, temp, start, mid, end);
        }
    }
    
    public static void merge(String[] arr, String[] temp, int start, int mid, int end) {
        for (int i=start;i<=end;i++) {
            temp[i] = arr[i];
        }
        
        int i=start;
        int j=mid+1;
        int k = start;
        
        while (i<=mid && j<=end) {
            if (temp[i].length() < temp[j].length()) {
                arr[k] = temp[i];
                i++;
            }
            else if (temp[i].length() > temp[j].length()) {
                arr[k] = temp[j];
                j++;
            }
            else if (temp[i].length() == temp[j].length()) {
                if (temp[i].compareTo(temp[j]) <= 0) {
                    arr[k] = temp[i];
                    i++;
                }
                else {
                    arr[k] = temp[j];
                    j++;
                }
            }
            k++;
        }
        
        while (i<=mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
}

