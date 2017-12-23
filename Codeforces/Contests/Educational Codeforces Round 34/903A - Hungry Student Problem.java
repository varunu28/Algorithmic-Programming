import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    while(n > 0) {
	        boolean isPres = false;
	        int num = Integer.parseInt(br.readLine());
	        
            for (int i=0; i<=33;i++) {
                for (int j=0; j<=33; j++) {
                    if (3*i + 7*j == num) {
                        isPres = true;
                        break;
                    }
                    else if (3*i + 7*j > num) break;
                }
                
                if(isPres) break;
            }
	        
	        if(isPres) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	        n--;
	    }
	}
}
