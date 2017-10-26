import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseUnsignedLong(br.readLine());

        while (t > 0) {
            long n = Long.parseUnsignedLong(br.readLine());
            System.out.println((Long.bitCount(n-1)&1) != 0 ? "Louise" : "Richard");
            t--;
        }
    }
}
