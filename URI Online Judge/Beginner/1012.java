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

        System.out.printf("TRIANGULO: %.3f\n",a*c/2);
        System.out.printf("CIRCULO: %.3f\n",3.14159*c*c);
        System.out.printf("TRAPEZIO: %.3f\n",(a+b)*c/2);
        System.out.printf("QUADRADO: %.3f\n",b*b);
        System.out.printf("RETANGULO: %.3f\n",a*b);
    }
}