import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            int t = sc.nextInt();
            while(t>0){
                int n = sc.nextInt();
                int col = 0;
                char[][] matrix=new char[n][n];
                while(col<n){
                    String s = sc.next();
                    for(int i=0;i<n;i++){
                        matrix[col][i]=s.charAt(i);
                    }
                    col++;
                }
                System.out.println(isValid(matrix) ? "YES" : "NO");
                t--;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    static boolean isValid(char[][] matrix){
        if(matrix.length==0) return true;
        for(char[] arr:matrix){
            Arrays.sort(arr);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length-1;j++){
                if(matrix[j][i]>matrix[j+1][i]) return false;
            }
        }
        return true;
    }
}
