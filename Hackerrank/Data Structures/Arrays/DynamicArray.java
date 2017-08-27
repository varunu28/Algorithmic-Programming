import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int q = Integer.parseInt(strs[1]);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<n; i++) {
        	arr.add(new ArrayList<Integer>());
        }

        int lastAnswer = 0;

        while(q > 0) {
        	strs = br.readLine().trim().split("\\s+");
        	int x = Integer.parseInt(strs[1]);
        	int y = Integer.parseInt(strs[2]);

        	int ind = (x^lastAnswer)%n;

        	if (Integer.parseInt(strs[0]) == 1) {
        		arr.get(ind).add(y);
        	}
        	else {
        		lastAnswer = arr.get(ind).get(y%arr.get(ind).size());
        		System.out.println(lastAnswer);
        	}
        }
    }
}