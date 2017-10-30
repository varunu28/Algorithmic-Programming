import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n>0) {
            String s = br.readLine();
            char[] ch=s.toCharArray();  
            int i = s.length()-1;
            while(i>0 && (int)ch[i-1] >= (int)ch[i]) {
                i--;
            }
            if (i<=0) { 
                System.out.println("no answer");
            }
            else {
                int j = s.length()-1;
                while((int)ch[j] <= (int)ch[i-1]) {
                    j--;
                }
                char temp = ch[i-1];
                ch[i-1] = ch[j];
                ch[j] = temp;
                
                j = s.length() - 1;
                while (i < j) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
                }
                
                System.out.println(String.valueOf(ch));
            }
            n--;
        }
    }
}
