import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int sum = 0;
        
        List<Integer> arr = new ArrayList<Integer>();
        
        for (int i=0;i<n;i++) {
            strs = br.readLine().trim().split("\\s+");
            if (strs[1].equals("1")) {
                arr.add(Integer.parseInt(strs[0]));
            }
            sum += Integer.parseInt(strs[0]);
        }
        
        Collections.sort(arr);
        
        int l = arr.size()-k;
        int j = 0;
        while (j<l) {
            sum -= 2*arr.get(j);
            j++;
        }
        
        System.out.println(sum);
    }
}
