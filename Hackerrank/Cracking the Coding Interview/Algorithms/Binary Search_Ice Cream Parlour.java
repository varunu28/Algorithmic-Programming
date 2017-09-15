import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            int small = 0;
            int big = 0;
            
            Map<Integer, Integer> map = new HashMap<>();
            
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                map.put(m-a[a_i], a_i);
            }
            
            for (int i=0;i<n; i++) {
                if (map.containsKey(a[i]) && map.get(a[i]) != i) {
                    small = Math.min(i,map.get(a[i])) + 1;
                    big = Math.max(i,map.get(a[i])) + 1;
                    break;
                }
            }
            
            System.out.println(small + " " + big);
        }
    }
}
