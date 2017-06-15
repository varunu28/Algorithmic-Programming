import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        String a = br.readLine();
        String b = br.readLine();
        
        BigInteger A, B; 
        A  = new BigInteger(a);
        B  = new BigInteger(b);
        
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}