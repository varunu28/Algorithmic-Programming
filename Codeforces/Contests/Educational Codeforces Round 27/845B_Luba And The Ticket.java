import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.println(solver(n));
    }

    public static int solver(String n) {
        int firstSum = findSum(n,0,3);
        int secSum = findSum(n,3,6);
        int diff = Math.abs(firstSum-secSum);
        if (diff>0 && diff%9 == 0 && countNine(n) == diff/9) {
            return diff/9;
        }
        else if (diff < 9 && diff>0) {
            return 1;
        }
        else if(diff == 0) {
            return 0;
        }
        else {
            return diff/9 + 1;
        }
    }

    public static int findSum(String s, int start, int end) {
        int sum = 0;
        for (int i=start;i<end;i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }

    public static int countNine(String s) {
        int count = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '9') {
                count++;
            }
        }
        return count;
    }
}