import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        int n = Integer.parseInt(br.readLine());
	        String[] s = br.readLine().split("\\s+");
	        int[] arr = new int[n];

	        Stack<Integer> revStack = new Stack<>();
	        
	        for (int i=0;i<n;i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        for (int i=n-1;i>=0;i--) {
	            int temp = arr[i];
	            
	            while (revStack.isEmpty() == false && revStack.peek() <= arr[i]) {
                    revStack.pop();
                }
                
	            if (revStack.isEmpty()) {
	                arr[i] = -1;
	            }
	            else {
	                arr[i] = revStack.peek();
	            }
	            
	            revStack.push(temp);
	        } 
	        
	        for (int num : arr) {
	            out.print(num + " ");
	        }
	        out.println();
	    }
	}
}
