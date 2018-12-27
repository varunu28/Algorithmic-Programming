import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;

class GFG {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        String s = br.readLine();
	        char[] ch = s.toCharArray();
	        boolean isBad = false;
	        
	        int consonantCount = 0;
	        int vowelCount = 0;
	        String vowels = "aeiou";
	        String consonants = "bcdefghjklmnpqrstvxyz";
	        
	        for (char c : ch) {
	            if (vowels.indexOf(c) != -1) {
	                vowelCount++;
	                consonantCount = 0;
	                
	                if (vowelCount > 5) {
	                    isBad = true;
	                    break;
	                }
	            }
	            else if (consonants.indexOf(c) != -1) {
	                vowelCount = 0;
	                consonantCount++;
	                
	                if (consonantCount > 3) {
	                    isBad = true;
	                    break;
	                }
	            }
	            else {
	                vowelCount++;
	                consonantCount++;
	            }
	       }
	       
	       out.println(isBad ? 0 : 1);
	    }
	}
}
