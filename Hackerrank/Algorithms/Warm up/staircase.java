import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int n = Integer.parseInt(br.readLine());
        int space = n-1;
        int mark = 1;
        for (int i=0;i<n;i++){
            for (int j=0;j<space;j++){
                System.out.print(" ");
            }
            for (int j=0;j<mark;j++){
                System.out.print("#");
            }
            System.out.println("");
            space--;
            mark++;
        }
    }
}