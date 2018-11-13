import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        
        md5.update(br.readLine().getBytes());
        byte[] digest = md5.digest();
        
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
