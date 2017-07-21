import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}













