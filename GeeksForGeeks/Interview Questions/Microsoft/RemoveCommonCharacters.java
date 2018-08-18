/*Two strings are given. Modify 1st string such that all the common characters of the 2nd strings have to be removed and
the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.

Note: If the modified string is empty then print '-1'.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of a string
s1.The next line consists of a string s2.

Output:
Print the required output.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCommonCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            System.out.println(concatenateCommon(s1, s2));
        }
    }

    private static String concatenateCommon(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        for (char c : s2.toCharArray()) {
            if (s1.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        return sb.length() == 0 ? "-1" : sb.toString();
    }
}

