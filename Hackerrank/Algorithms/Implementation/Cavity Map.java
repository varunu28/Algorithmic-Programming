import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        String[] copy = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            copy[grid_i] = grid[grid_i];
        }
        
        for (int i=1;i<n-1;i++) {
            for (int j=1;j<grid[i].length()-1;j++) {
                int v = Integer.parseInt(String.valueOf(copy[i].charAt(j)));
                int up = Integer.parseInt(String.valueOf(copy[i-1].charAt(j)));
                int down = Integer.parseInt(String.valueOf(copy[i+1].charAt(j)));
                int left = Integer.parseInt(String.valueOf(copy[i].charAt(j-1)));
                int right = Integer.parseInt(String.valueOf(copy[i].charAt(j+1)));
                
                if (v > up && v > down && v > left && v > right) {
                    grid[i] = grid[i].substring(0,j) + "X" + grid[i].substring(j+1,grid[i].length());
                }  
            }
        }
        
        for(int grid_i=0; grid_i < n; grid_i++){
            System.out.println(grid[grid_i]);
        }
    }
}

