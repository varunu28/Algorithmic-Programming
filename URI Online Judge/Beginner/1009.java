import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double f_salary,t_sell,bonus,t_salary;
        name = sc.next();
        f_salary = sc.nextDouble();
        t_sell = sc.nextDouble();
        bonus = (t_sell*15)/100;
        t_salary = f_salary+bonus;
        System.out.printf("TOTAL = R$ %.2f\n",t_salary);
    }

}