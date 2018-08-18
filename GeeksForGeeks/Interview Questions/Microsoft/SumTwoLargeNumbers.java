import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Given two non-negative numbers X and Y. The task is calculate the sum of X and Y. If the number of digits in sum
(X+Y) are equal to the number of digits in X, then print sum, else print X.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test
case contains two numbers X and Y.

Output:
For each test case, print the required answer.*/

public class SumTwoLargeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] s = br.readLine().trim().split("\\s+");
            System.out.println(findSum(s[0], s[1]));
        }
    }

    private static String findSum(String s1, String s2) {
        String ans = findSumImpl(s1, s2);
        return ans.length() == s1.length() ? ans : s1;
    }

    private static String findSumImpl(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int num = Integer.parseInt(String.valueOf(s1.charAt(i))) + Integer.parseInt(String.valueOf(s2.charAt(j))) + carry;
            carry = num > 9 ? 1 : 0;
            num = num > 9 ? num - 10 : num;

            sb.append(num);
            i--;
            j--;
        }

        while (i >= 0) {
            int num = Integer.parseInt(String.valueOf(s1.charAt(i))) + carry;
            carry = num > 9 ? 1 : 0;
            num = num > 9 ? num - 10 : num;

            sb.append(num);
            i--;
        }

        while (j >= 0) {
            int num = Integer.parseInt(String.valueOf(s2.charAt(j))) + carry;
            carry = num > 9 ? 1 : 0;
            num = num > 9 ? num - 10 : num;

            sb.append(num);
            j--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}

