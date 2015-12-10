import java.io.IOException;
import java.io.*;
public class Main {
   
    public static void main(String[] args) throws IOException {
   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
          
        int X= a+b;
        System.out.println("X = "+Integer.toString(X));
    }
   
}