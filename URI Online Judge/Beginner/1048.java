import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        float salary = Float.parseFloat(br.readLine());

        if(salary >= 0 && salary <= 400){
            System.out.printf("Novo salario: %.2f\n", (salary + 0.15*salary));
            System.out.printf("Reajuste ganho: %.2f\n", 0.15*salary);
            System.out.printf("Em percentual: %d", 15);
            System.out.println(" %");
        }
        else if(salary > 400 && salary <= 800){
            System.out.printf("Novo salario: %.2f\n", (salary + 0.12*salary));
            System.out.printf("Reajuste ganho: %.2f\n", 0.12*salary);
            System.out.printf("Em percentual: %d", 12);
            System.out.println(" %");
        }
        else if(salary > 800 && salary <= 1200){
            System.out.printf("Novo salario: %.2f\n", (salary + 0.10*salary));
            System.out.printf("Reajuste ganho: %.2f\n", 0.10*salary);
            System.out.printf("Em percentual: %d", 10);
            System.out.println(" %");
        }
        else if(salary > 1200 && salary <= 2000){
            System.out.printf("Novo salario: %.2f\n", (salary + 0.07*salary));
            System.out.printf("Reajuste ganho: %.2f\n", 0.07*salary);
            System.out.printf("Em percentual: %d", 7);
            System.out.println(" %");
        }
        else {
            System.out.printf("Novo salario: %.2f\n", (salary + 0.04*salary));
            System.out.printf("Reajuste ganho: %.2f\n", 0.04*salary);
            System.out.printf("Em percentual: %d", 4);
            System.out.println(" %");
        }
    }
}