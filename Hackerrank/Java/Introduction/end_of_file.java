import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class end_of_file {

    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        int i=1;
        
        while(sc.hasNext())
        {
        	System.out.println(i+" " + sc.nextLine());
        	i++;
        }
    }
}