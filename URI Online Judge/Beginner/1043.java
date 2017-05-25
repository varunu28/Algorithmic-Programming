import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        float a = Float.parseFloat(strs[0]);
        float b = Float.parseFloat(strs[1]);
        float c = Float.parseFloat(strs[2]);

        if ((a+b > c && a+c > b && b+c > a)){
            System.out.printf("Perimetro = %.1f\n",(a+b+c));
        }
        else {
            System.out.printf("Area = %.1f\n",((a+b)*c/2));
        }
    }
}