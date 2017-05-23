import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        float rate = Float.parseFloat(br.readLine());

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = U$ " + f.format(h*rate));
    }
}