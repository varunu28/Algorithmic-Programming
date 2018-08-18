/* Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Input:

The first line of input contains an integer T denoting the number of test cases.
The next T lines contains T strings.

Output:

Print the value of the string assuming no order of precedence and evaluation is done from left to right*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanStringValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            System.out.println(findBooleanStringValue(s));
        }
    }

    private static int findBooleanStringValue(String s) {
        int c = Integer.parseInt(String.valueOf(s.charAt(0)));

        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                c = c & Integer.parseInt(String.valueOf(s.charAt(i+1)));
            }
            else if (s.charAt(i) == 'B') {
                c = c | Integer.parseInt(String.valueOf(s.charAt(i+1)));
            }
            else {
                c = c ^ Integer.parseInt(String.valueOf(s.charAt(i+1)));
            }

            i += 2;
        }

        return c;
    }
}

