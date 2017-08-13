import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        if (m == 0) {
            System.out.println(convert(h).toLowerCase() + " o' clock");
        }
        else if (m == 15) {
            System.out.println("quarter past " + convert(h).toLowerCase());
        }
        else if (m == 30) {
            System.out.println("half past " + convert(h).toLowerCase());
        }
        else if (m == 45) {
            if (h != 12)
                System.out.println("quarter to " + convert(h+1).toLowerCase());
            else 
                System.out.println("quarter to " + convert(1).toLowerCase());
        }
        else {
            if (m < 30) {
                System.out.println(convert(m).toLowerCase() + " minutes past " + convert(h).toLowerCase());
            }
            else {
                if (h != 12)
                    System.out.println(convert(60-m).toLowerCase() + " minutes to " + convert(h+1).toLowerCase());
                else 
                    System.out.println(convert(60-m).toLowerCase() + " minutes to " + convert(1).toLowerCase());
            }
        }
    }
    public static String convert(final int n) {
        final String[] units = { "", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };

        final String[] tens = {
                "", 		// 0
                "",		// 1
                "Twenty", 	// 2
                "Thirty", 	// 3
                "Forty", 	// 4
                "Fifty", 	// 5
                "Sixty", 	// 6
                "Seventy",	// 7
                "Eighty", 	// 8
                "Ninety" 	// 9
        };

        String stringValue = "";

        if (n < 20) {
            stringValue = units[n];
        }

        else if (n < 100) {
            stringValue = tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        return stringValue;
    }
}
