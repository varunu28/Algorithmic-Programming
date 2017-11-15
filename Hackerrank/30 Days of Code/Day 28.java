import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<String>();
        
        for (int i=0;i<n;i++) {
            String[] inp = br.readLine().split("\\s");
            if (inp[1].endsWith("@gmail.com")) {
                ans.add(inp[0]);
            }
        }
        
        Collections.sort(ans);
        
        for(int i=0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
