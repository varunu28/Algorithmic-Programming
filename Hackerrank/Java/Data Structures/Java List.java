import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().trim().split("\\s+");
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0;i<n;i++) {
            arr.add(Integer.parseInt(strs[i]));
        }

        int t = Integer.parseInt(br.readLine());
        while (t>0) {
            Character c = br.readLine().charAt(0);
            if (c == 'I') {
                strs = br.readLine().trim().split("\\s+");
                arr.add(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
            }
            else {
                int p = Integer.parseInt(br.readLine());
                arr.remove(p);
            }
            t--;
        }
        for (int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
