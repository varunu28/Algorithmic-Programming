import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Double PI = 3.14159;
        int rad = Integer.parseInt(br.readLine());
        Double vol = ((4.0/3)*PI*(Math.pow(rad,3)));
        System.out.printf("VOLUME = %.3f\n",vol);
    }
}