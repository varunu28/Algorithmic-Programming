import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Double PI = 3.14159;
        Double rad = Double.parseDouble(br.readLine());
        DecimalFormat f = new DecimalFormat("##.0000");
        System.out.println("A=" + (f.format(PI*rad*rad)));
    }
}
