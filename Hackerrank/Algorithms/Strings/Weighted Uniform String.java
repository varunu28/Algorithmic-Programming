import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int sum = (int)s.charAt(0) - 96;
      
        Set<Integer> numList = new HashSet<Integer>();
        numList.add(sum); 
        
        for(int i=0 ;i< s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)) {
                sum += (int)s.charAt(i+1) - 96;
            }
            else {
                sum = (int)s.charAt(i+1) - 96;
            }
            numList.add(sum); 
        }

        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(numList.contains(x) ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
