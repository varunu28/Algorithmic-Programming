import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public java_datatypes {

    
    public static Boolean checkByte(Long num)
        {
        if (num>=-128 && num<=127)
                return true;
        return false;
        }
    
    public static Boolean checkShort(Long num)
        {
        if (num>=-32768 && num<=32767)
                return true;
        return false;
        }
    
    public static Boolean checkInt(Long num)
        {
        if (num>=-2147483648 && num<=2147483647)
                return true;
        return false;
        }
    
    public static Boolean checkLong(Long num)
        {
        BigInteger max = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger min = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger big = BigInteger.valueOf(num.longValue());
        //System.out.println(max+" "+min+" "+big);
        if (max.compareTo(big)>=0 && min.compareTo(big)<=0)
                return true;
        return false;
        }
   
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int len = Integer.parseInt(in.readLine());
        String med = "";
        for(int i = 0;i<=len-1;i++)
        {
            s = in.readLine();
            try
                {
                if(s.length()>0 && s.length()<=20)
                    {
                         
                         if(Solution.checkByte(Long.valueOf(s)))
                             med += "\n* byte";
                         if(Solution.checkShort(Long.valueOf(s)))
                             med += "\n* short";
                         if(Solution.checkInt(Long.valueOf(s)))
                             med += "\n* int";
                         if(Solution.checkLong(Long.valueOf(s)))
                             med += "\n* long";
                    System.out.println(s+ " can be fitted in:"+med);
                    med = "";
                }
              else
                  System.out.println(s+" can't be fitted anywhere.");
                        }
        catch(Exception e)
            {
            System.out.println(s+" can't be fitted anywhere.");
            }
    }
    }
}