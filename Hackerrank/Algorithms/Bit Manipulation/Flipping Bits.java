import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        while(t>0) {
            long n = in.nextLong();
            System.out.println(~n + 0x0000000100000000L);
            t--;
        }
    }
}
