//Sherlock and beast

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class competitive_programming {
	private static String sherlock(final int target) {
	    int threes = 0;
	    int fives = 0;
	    int digits = target;
	    while (digits > 0) {
	        if (digits % 3 == 0) {
	            fives = digits;
	            break;
	        }
	        digits -= 5;
	    }
	    threes = target - digits;
	    if (digits < 0 || threes % 5 != 0) {
	        return "-1";
	    }
	    StringBuilder sb = new StringBuilder(target);
	    while (fives-- > 0) {
	        sb.append("5");
	    }
	    while (threes-- > 0) {
	        sb.append("3");
	    }
	    return sb.toString();
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
        	int n = in.nextInt();
        	
        	System.out.println(sherlock(n));
        	t--;
        }
    }
}
