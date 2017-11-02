import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long theGreatXor(long x){
        long count = 0;
        int bitPos = 0;
        while(x>0) {
            if((x&1) == 0) {
                count += (1L<<bitPos);
            }
            bitPos++;
            x >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}
