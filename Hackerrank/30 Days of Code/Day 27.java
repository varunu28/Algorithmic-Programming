import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
      
    int t = 5;
    System.out.println(t);

    for (int i = 0, n = 46; i < t; i++, n += (int)Math.ceil(Math.log(n * n))) {
    
      int k = n - ((int)Math.ceil(Math.sqrt(n)));
      System.out.println(n + " " + k);

      int a[] = new int[n];
      Arrays.fill(a, 0, n, 0);
      
      if (i % 2 == 0) {
        Arrays.fill(a, 0, 2, -15);
        Arrays.fill(a, 5, n, 10);
      }
      else {
        Arrays.fill(a, 0, k >> 1, -15);
        Arrays.fill(a, k + 1, n, 10);
      }
       
      for (int ai : a) System.out.print(ai + " ");
        System.out.println();
    }
  }
}
