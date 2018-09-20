public class InterLeavedStrings {

    public boolean isInterLeave(String a, String b, String c) {
        return isInterLeaveUtil(a, b, c, 0, 0, 0);
    }

    private boolean isInterLeaveUtil(String a, String b, String c, int i, int j, int k) {
        if (k == c.length()) {
            return true;
        }

        boolean ans = false;

        if (i < a.length() && a.charAt(i) == c.charAt(i+j)) {
            ans = ans || isInterLeaveUtil(a, b, c, i+1, j, k+1);
        }

        if (j < b.length() && b.charAt(j) == c.charAt(i+j)) {
            ans = ans || isInterLeaveUtil(a, b, c, i, j+1, k+1);
        }

        return ans;
    }
}
