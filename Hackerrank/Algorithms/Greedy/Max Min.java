import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];

      for(int i = 0; i < N; i ++)
         list[i] = Integer.parseInt(in.readLine());
      
      int unfairness = Integer.MAX_VALUE;
       
       Arrays.sort(list);
       
      int j = 0;
       while (j+K<=N) {
           int diff = list[j+K-1] - list[j];
           unfairness = Math.min(unfairness, diff);
           j ++;
       }
       
      System.out.println(unfairness);
   }
}
