import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<=10; i++)
        {
        	System.out.println(Integer.toString(N) + " x " + Integer.toString(i) + " = " + Integer.toString(N*i));
        }
    }
}
