import java.io.*;
import java.util.*;

public class anagrams {

   static boolean isAnagram(String A, String B) {
	  
	  	char[] word1 = A.replaceAll("[\\s]", "").toCharArray();
	    char[] word2 = B.replaceAll("[\\s]", "").toCharArray();
	    Arrays.sort(word1);
	    Arrays.sort(word2);
	    return Arrays.equals(word1, word2);
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A.toLowerCase(),B.toLowerCase());
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}