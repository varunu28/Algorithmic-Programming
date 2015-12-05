//Time Conversion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        if(time.indexOf("PM")!=-1)
        {
        	if(time.indexOf("12")!=-1)
        	{
        		System.out.println(time.substring(0, time.length()-2));
        	}
        	else
        	{
        		System.out.println(String.valueOf(Integer.parseInt(time.substring(0, 2))+12) + time.substring(2,time.length()-2));
        	}
        }
        else if(time.indexOf("12")!=-1)
        {
        	System.out.println("00"+time.substring(2, time.length()-2));
        }
        else
        {
        	System.out.println(time.substring(0, time.length()-2));
        }
    }
}
