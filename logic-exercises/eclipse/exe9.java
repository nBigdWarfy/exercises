package eclipse;

import java.util.Scanner;

public class exe9 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double a = scanner.nextDouble();
        double fatorial = 1;

        for (int i = 1; i <= a; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + a + " é: " + fatorial);
        scanner.close();
    }   
}
