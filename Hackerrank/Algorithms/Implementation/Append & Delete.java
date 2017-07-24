import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int commonLength = 0;

        for (int i=0; i<Math.min(s.length(),t.length());i++){
            if (s.charAt(i)==t.charAt(i))
                commonLength++;
            else
                break;
        }

        if((s.length()+t.length()-2*commonLength)>k){
            System.out.println("No");
        }

        else if((s.length()+t.length()-2*commonLength)%2==k%2){
            System.out.println("Yes");
        }

        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }
}