import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        final char[] S = (new BufferedReader(new InputStreamReader(System.in))).readLine().toCharArray();
        
        System.out.print(isValid(S) ? "YES" : "NO");
    }
    
    private static boolean isValid(final char[] S){
        
        if(S.length < 2){
            return true;
        }

        final int[] L = new int[26];
        for(int i = 0, N = S.length; i < N; ++L[S[i++] - 'a']){}

        Arrays.sort(L);
        
        int i;
        for(i = 0; i < 26 && L[i] == 0; ++i){}
        
        if(L[i] == L[25]){
            return true;
        }

        if(L[25] > L[24]){
            return L[i] == L[24] && L[25] - L[24] == 1;
        }
        
        return L[i] < L[i+1] && L[i+1] == L[25] && L[i] == 1;
    }
}
