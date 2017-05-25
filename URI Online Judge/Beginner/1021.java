import java.math.BigDecimal;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal amount = sc.nextBigDecimal();
		sc.close();
		
		int[] notes = { 100, 50, 20, 10, 5, 2 };
		BigDecimal[] coins = {
				BigDecimal.ONE,
				new BigDecimal("0.50"),
				new BigDecimal("0.25"),
				new BigDecimal("0.10"),
				new BigDecimal("0.05"),
				new BigDecimal("0.01") };
		
		System.out.println("NOTAS:");
		
		for (int n : notes) {
			BigDecimal[] divideAndRemainder = amount.divideAndRemainder(new BigDecimal(n));
			System.out.printf("%d nota(s) de R$ %d.00\n", divideAndRemainder[0].intValue(), n);
			amount = divideAndRemainder[1];
		}
		
		System.out.println("MOEDAS:");
		
		for (BigDecimal n : coins) {
			BigDecimal[] divideAndRemainder = amount.divideAndRemainder(n);
			System.out.printf("%d moeda(s) de R$ %.2f\n", divideAndRemainder[0].intValue(), n);
			amount = divideAndRemainder[1];
		}
	}

}