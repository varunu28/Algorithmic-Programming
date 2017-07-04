import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        String Res = "";
        if (year == 1918){
            Res = "26.09.1918";
        } else {
            if (leap(year)){
                Res = "12.09." + year;
            }
            else Res = "13.09." + year;
        }
        return Res;
    
    }
    
    static boolean leap(int year){
        if (year < 1917){
            if (year % 4 == 0){
                return true;
            } 
            else 
                return false;
        }
        else {
            if (year % 400 == 0){
                return true;
            }
            else if (year % 4 == 0 && year % 100 != 0){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
