import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        Arrays.sort(arr);
        long min_sum = 0;
        long max_sum = 0;
        for (int i=0;i<4;i++){
            min_sum += arr[i];
        }
        for (int i=4;i>0;i--){
            max_sum += arr[i];
        }
        
        System.out.print(min_sum + " " + max_sum);
    }
}
