import java.util.*;
import java.text.*;

public class currency_formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale.setDefault(new Locale("en","IN"));
        String india = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.CHINA);
        String china = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.US);
        String us = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.FRANCE);
        String france = NumberFormat.getCurrencyInstance().format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
