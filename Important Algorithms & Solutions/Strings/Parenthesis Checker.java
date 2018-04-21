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
	        boolean isBalanced = true;
	        
    	    Stack<Character> brackets = new Stack<>();
    	    String openBrackets = "({[";
    	    String closedBrackets = ")}]";
    	    
    	    for (char c : s.toCharArray()) {
    	        if (openBrackets.indexOf(c) != -1) {
    	            brackets.push(c);
    	        }
    	        else {
    	            if (brackets.isEmpty()) {
    	                isBalanced = false;
    	                break;
    	            }
    	            
    	            char ch = brackets.pop();
    	            if (openBrackets.indexOf(ch) != closedBrackets.indexOf(c)) {
    	                isBalanced = false;
    	                break;
    	            }
    	        }
    	    }
    	    
    	    if (!isBalanced) {
    	        out.println("not balanced");
    	    }
    	    else {
    	        out.println(brackets.isEmpty() ? "balanced" : "not balanced");
    	    }
	    }
	}
}
