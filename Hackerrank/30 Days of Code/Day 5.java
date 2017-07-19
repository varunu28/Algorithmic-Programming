import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i=1; i<=10;i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
