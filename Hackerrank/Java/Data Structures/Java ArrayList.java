import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<n;i++) {
            String[] strs = br.readLine().trim().split("\\s+");
            list.add(new ArrayList<Integer>());
            int k = Integer.parseInt(strs[0]);
            for (int j=0;j<k;j++) {
                list.get(i).add(Integer.parseInt(strs[j+1]));
            }
        }
        
        int q = Integer.parseInt(br.readLine());
        while (q > 0) {
            String[] strs = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);
            if (x > list.size() || y > list.get(x-1).size()) {
                System.out.println("ERROR!");
            }
            else {
                System.out.println(list.get(x-1).get(y-1));
            }
            q--;
        }
    }
}
