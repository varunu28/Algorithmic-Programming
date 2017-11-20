import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  
        Map<Integer, String> map = new HashMap<>();
        
        for(int a0 = 0; a0 < n; a0++){
            String[] strs = br.readLine().trim().split("\\s+");
            String name = strs[0];
            String cost = strs[1];
            
            int count7 = (int) cost.chars().filter(num -> num == '7').count();
            int count4 = (int) cost.chars().filter(num -> num == '4').count();
            
            if (count7+count4 == cost.length() && count7 == count4) {
                map.put(Integer.parseInt(cost), name);
            }
        }
        
        int[] ans = new int[map.size()];
        int k = 0;
        
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
        	ans[k] = entry.getKey(); 
            k++;
        }
        
        Arrays.sort(ans);
        
        System.out.println(ans.length == 0 ? -1 : map.get(ans[0]));
    }
}
