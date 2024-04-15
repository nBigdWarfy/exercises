package eclipse.cambio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CurrencyConverter conv = new eclipse.cambio.CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		double dollar = scanner.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double q = scanner.nextDouble();
		
		double result = conv.converting(dollar, q);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", result);
		
		scanner.close();
	}
}