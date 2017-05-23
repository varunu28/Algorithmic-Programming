import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        //Scanner sc= new Scanner(System.in);
        Float a = Float.parseFloat(br.readLine());
        Float b = Float.parseFloat(br.readLine());
        Float c = Float.parseFloat(br.readLine());
        float med = (float) (((a * 2) + (b * 3) + (c * 5)) / (10));
        String media = String.format("MEDIA = %,.1f", med);
        System.out.print(media +"\n");
    }
}