import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String strs = br.readLine();
        int maxCount = 0;
        int count = 0;
        
        for (int i=0; i<strs.length(); i++) {
            if (strs.charAt(i) != ' ') {
                if (Character.isUpperCase(strs.charAt(i))) {
                    count++;
                }
            }
            else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        } 
        System.out.println(Math.max(maxCount, count));
    }
}