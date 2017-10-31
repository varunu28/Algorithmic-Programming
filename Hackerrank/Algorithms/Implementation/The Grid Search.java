import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t>0) {
            String[] strs = br.readLine().trim().split("\\s+");
            int R = Integer.parseInt(strs[0]);
            int C = Integer.parseInt(strs[1]);
            String[] inp = new String[R];
            for (int i=0;i<R;i++) {
                inp[i] = br.readLine();
            }
            
            strs = br.readLine().trim().split("\\s+");
            int r = Integer.parseInt(strs[0]);
            int c = Integer.parseInt(strs[1]);
            
            String[] pattern = new String[r];
            for (int i=0;i<r;i++) {
                pattern[i] = br.readLine();
            }
            
            boolean result = false;
            
            for(int k=0;k<=R-r;k++) {
                int end=c;
                int start=0;
                int count = 0;
                while(end<=C){

                    if(inp[k].substring(start,end).equals(pattern[0])){
                        for(int i=1;i<r;i++) {
                            if(inp[k+i].substring(start,end).equals(pattern[i])) {
                                count++;
                            }
                            if(count==r-1){
                                result=true;
                            }
                        }                 
                    }
                    
                    end++;
                    start++;
                }

            }
           
            System.out.println(result ? "YES" : "NO");
            t--;
        }
    }
}
