import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int[] round_grades = new int[grades.length];
        for(int i=0;i<grades.length;i++) {
            if(grades[i]<38) {
                round_grades[i] = grades[i];
            }
            else if (grades[i]%5 == 3 || grades[i]%5 == 4) {
                round_grades[i] = 5*((grades[i]/5) + 1);
            }
            else {
                round_grades[i] = grades[i];
            }
        }
        return round_grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
