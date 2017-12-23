import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] strs = br.readLine().split("\\s+");
	    int h1 = Integer.parseInt(strs[0]);
	    int a1 = Integer.parseInt(strs[1]);
	    int c = Integer.parseInt(strs[2]);
	    
	    strs = br.readLine().split("\\s+");
	    int h2 = Integer.parseInt(strs[0]);
	    int a2 = Integer.parseInt(strs[1]);
	    
	    ArrayList<String> ans = new ArrayList<>();
	    
	    while(h2 > 0) {
	        if (a2 < h1 || h2 - a1 <= 0) {
	            h2 -= a1;
                h1 -= a2;
                ans.add("STRIKE");
	        }
	        else {
	            h1 += c-a2;
	            ans.add("HEAL");
	        }
	    }
	    
	    System.out.println(ans.size());
	    for (String s : ans) {
	        System.out.println(s);
	    }
	}
}
