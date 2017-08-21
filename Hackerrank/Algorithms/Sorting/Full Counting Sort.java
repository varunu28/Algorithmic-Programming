
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String[] word = new String[n];

        for (int i=0;i<n;i++) {
            String[] strs = br.readLine().trim().split("\\s+");
            num[i] = Integer.parseInt(strs[0]);
            word[i] = strs[1];
        }

        StringBuilder[] ans = new StringBuilder[100];
        for (int i=0;i<100;i++) {
            ans[i] = new StringBuilder("");
        }

        for (int i=0;i<n;i++) {
            if (i < n/2) {
                ans[num[i]].append("-" + " ");
            }
            else {
                ans[num[i]].append(word[i] + " ");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<100;i++) {
            sb.append(ans[i].toString());
        }
        System.out.println(sb.toString());
    }
}
