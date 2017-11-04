import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
        while(scanner.hasNext()) {
            heights.add(scanner.nextInt());
        }
        System.out.println(areaOfLargestRectangle(heights));
    }

    public static int areaOfLargestRectangle(List<Integer> heights) {
        heights.add(0);
        Stack<Integer> stack = new Stack<>();
        int maxAreaSoFar = -1;
        for(int height : heights) {
            int n = 0;
            while(!stack.isEmpty() && stack.peek() > height) {
                n++;
                maxAreaSoFar = Math.max(maxAreaSoFar, n* stack.pop());
            }
            for(int i = 0; i < n+1; i++) {
                stack.push(height);
            }
        }
        return maxAreaSoFar;
    }
}
