import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        float sal = Float.parseFloat(br.readLine());

        if(sal <= 2000) {
            System.out.println("Isento");
        }
        else {
            sal -= 2000;
            float tax = (float) 0.0;
            int i = 1;
            while (sal > 0) {
                if (i == 1) {
                    tax += 0.08 * Math.min(1000, sal);
                    i++;
                    sal -= Math.min(1000, sal);
                } else if (i == 2) {
                    tax += 0.18 * Math.min(1500, sal);
                    i++;
                    sal -= Math.min(1500, sal);
                } else {
                    tax += 0.28 * sal;
                    sal = 0;
                }
            }
            System.out.printf("R$ %.2f\n",tax);
        }
    }
}