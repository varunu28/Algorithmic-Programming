import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(isPrime(num) ? "Prime" : "Not prime");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i=5; i <= (int)Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
