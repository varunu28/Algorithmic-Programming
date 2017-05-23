import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        //Scanner sc= new Scanner(System.in);
        Float a = Float.parseFloat(br.readLine());
        Float b = Float.parseFloat(br.readLine());
        float med = (float) (((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", med);
        System.out.print(media +"\n");
    }
}