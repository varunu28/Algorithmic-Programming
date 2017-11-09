import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        String strs = br.readLine();

        System.out.println(findNumOfCommands(strs,n));
    }

    private static int findNumOfCommands(String str, int n) {

        int hor = 0;
        int ver = 0;

        for (int i=0;i<n;i++) {
            if (str.charAt(i) == 'U') {
                ver++;
            }
            else if (str.charAt(i) == 'D') {
                ver--;
            }
            else if (str.charAt(i) == 'R') {
                hor++;
            }
            else if (str.charAt(i) == 'L') {
                hor--;
            }
        }

        n -= Math.abs(ver);
        n -= Math.abs(hor);

        return n;
    }
}
