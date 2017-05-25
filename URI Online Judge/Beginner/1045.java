import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String  lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        float x = Float.parseFloat(strs[0]);
        float y = Float.parseFloat(strs[1]);
        float z = Float.parseFloat(strs[2]);

        float a = Math.max(Math.max(x,y),z);
        float b = Math.max(Math.min(x,y), Math.min(Math.max(x,y),z));
        float c = Math.min(Math.min(x,y),z);

        if (a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {

            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}