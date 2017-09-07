import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int maxNum = Integer.MIN_VALUE;
        
        while (n>0) {
            String[] strs = br.readLine().trim().split("\\s+");
            
            if (strs.length == 2) {
                stack.push(new ArrayList<Integer>());
                if (Integer.parseInt(strs[1]) > maxNum) {
                    maxNum = Integer.parseInt(strs[1]);
                }
                stack.peek().add(Integer.parseInt(strs[1]));
                stack.peek().add(maxNum);
            }
            
            else if (Integer.parseInt(strs[0]) == 2) {
                stack.pop();
                if (stack.empty()) {
                    maxNum = Integer.MIN_VALUE;
                }
                else if (stack.peek().get(1) != maxNum) {
                    maxNum = stack.peek().get(1);
                }
            }
            else {
                System.out.println(stack.peek().get(1));
            }
            n--;
        } 
    }
}
