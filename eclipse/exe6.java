package eclipse;

import java.util.Scanner;

public class exe6 {
public static void main(String[] args) {
		System.out.println("Insira um valor maior que 0 e menor que 1000: ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro entre 0 e 1000: ");
		
		int x = scanner.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}
}
