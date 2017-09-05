import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        
        Map<String, Integer> mapMag = new HashMap<>();
        Map<String, Integer> mapNote = new HashMap<>();
        
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            
            if (mapMag.containsKey(magazine[magazine_i])) {
                mapMag.put(magazine[magazine_i], mapMag.get(magazine[magazine_i]) + 1);
            }
            else {
                mapMag.put(magazine[magazine_i], 1);
            }   
        }
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            if (mapNote.containsKey(ransom[ransom_i])) {
                mapNote.put(ransom[ransom_i], mapNote.get(ransom[ransom_i]) + 1);
            }
            else {
                mapNote.put(ransom[ransom_i], 1);
            }   
        }
        
        String ans = "Yes";
        for (int i=0;i<n;i++) {
            if (mapMag.containsKey(ransom[i])) {
                if (mapNote.get(ransom[i]) > mapMag.get(ransom[i])) {
                    ans = "No";
                    break;
                }
            }
            else {
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
}

