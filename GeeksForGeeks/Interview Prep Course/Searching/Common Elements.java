import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String[] s = br.readLine().split("\\s+");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        
	        int[] arr1 = new int[a];
	        int[] arr2 = new int[b];
	        int[] arr3 = new int[c];
	        
	        s = br.readLine().split("\\s+");
	        for (int i=0; i<a; i++) {
	            arr1[i] = Integer.parseInt(s[i]);
	        }
	        
	        s = br.readLine().split("\\s+");
	        for (int i=0; i<b; i++) {
	            arr2[i] = Integer.parseInt(s[i]);
	        }
	        
	        s = br.readLine().split("\\s+");
	        for (int i=0; i<c; i++) {
	            arr3[i] = Integer.parseInt(s[i]);
	        }
	        
	        List<Integer> list = getCommon(arr1, arr2, arr3, a, b, c);
	        
	        if (list.size() == 0) {
	            out.println(-1);
	        }
	        else {
	            for (int num : list) {
	                out.print(num + " ");
	            }
	            
	            out.println();
	        }
	    }
	}
	
	private static List<Integer> getCommon(int[] arr1, int[] arr2, int[] arr3, int a, int b, int c) {
	    int i = 0;
	    int j = 0;
	    int k = 0;
	    
	    Set<Integer> set = new LinkedHashSet<>();
	    
	    while (i < a && j < b && k < c) {
	        if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	            set.add(arr1[i]);
	            i++;
	            j++;
	            k++;
	        }
	        else {
    	        int max = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
    	        
    	        if (arr1[i] != max) {
    	            i++;
    	        }
    	        
    	        if (arr2[j] != max) {
    	            j++;
    	        }
    	        
    	        if (arr3[k] != max) {
    	            k++;
    	        }
	        }
	    }
	    
	    return new ArrayList<>(set);
	}
}
