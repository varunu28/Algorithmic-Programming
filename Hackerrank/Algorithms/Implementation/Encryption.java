import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int row = (int)Math.round(Math.sqrt(s.length()));
        int column = row >= Math.sqrt(s.length()) ? row : row+1;   
       
        for (int i=0;i<column;i++) {
            for (int j=i;j<s.length();j+=column) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
