// Count Number of BSTs Possible with n distinct keys

public class Solution {

    public static void main (String... args) {

        int n = 5;
        System.out.println(findNumberOfBSTs(n));
    }

    public static int findNumberOfBSTs(int n) {
        int[] dp = new int[n+1];

        dp[0] = dp[1] = 1;

        for (int i=2; i<=n; i++) {
            for (int j=0; j<i; j++) {
                dp[i] += dp[j]*dp[i-j-1];
            }
        }

        return dp[n];
    }
}