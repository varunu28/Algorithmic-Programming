import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] arr)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int n = arr.length;
        for (int i=0;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; 
            if (i!=0) {
                for (int k=0;k<n;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
