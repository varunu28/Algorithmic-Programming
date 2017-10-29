import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String[] strs = br.readLine().trim().split("\\s+"); 
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        
        strs = br.readLine().trim().split("\\s+");

        Map<Integer,Integer> towerMap = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++) {
            towerMap.put(i, Integer.parseInt(strs[i]));
        }

        int start = k-1;
        int end = start+k-1;
        int next = end+k;
        int towers = 0;
        Set<Integer> towerSet = new HashSet<Integer>();

        while(start <n) {
            while(start >=0 && towerMap.get(start)!=1) {
                start--;
            }
            if(start >= 0 && !towerSet.contains(start)) {
                towerSet.add(start);
            }
            else {
                towers = -1;
                break;
            }
            end = start+k-1;
            next = end+k;
            start = next;
            
            if(next >= n && end < n-1) {
                start = n-1;
            }
            
            towers++;
        }

        System.out.println(towers);
    }
}
