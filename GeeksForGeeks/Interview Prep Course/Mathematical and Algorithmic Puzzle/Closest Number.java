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
	        
	        int numLeft = a;
	        int numRight = a;
	        
	        while(true) {
	            int leftRem = numLeft % b;
	            int rightRem = numRight % b;
	            
	            if (leftRem == 0 && rightRem == 0) {
	                if (Math.abs(numLeft) > Math.abs(numRight)) {
	                    out.println(numLeft);
	                }
	                else {
	                    out.println(numRight);
	                }
	                break;
	            }
	            else if (leftRem == 0) {
	                out.println(numLeft);
	                break;
	            }
	            else if (rightRem == 0) {
	                out.println(numRight);
	                break;
	            }
	            
	            numLeft--;
	            numRight++;
	        }
	    }
	}
}
