import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        
        sha.update(br.readLine().getBytes());
        byte[] digest = sha.digest();
        
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
