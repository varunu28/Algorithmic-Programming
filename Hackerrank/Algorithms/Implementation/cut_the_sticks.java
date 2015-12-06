//Cut the sticks

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n;){
            sb.append((n - i) + "\n");
            while (++i < n && arr[i-1] == arr[i]){}
        }
        
        System.out.print(sb);
    }
}
