import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int X = Integer.parseInt(br.readLine());
        float Y = Float.parseFloat(br.readLine());

        System.out.printf("%.3f km/l\n",X/Y);
    }
}