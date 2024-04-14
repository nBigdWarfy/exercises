package eclipse;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num, den;
        int t;

        System.out.println("Digite a quantidade de vezes que deseja realizar a operação: ");
        t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Digite o numerador: ");
            num = scanner.nextFloat();
            System.out.printf("Digite o denominador: ");
            den = scanner.nextFloat();
            System.out.println("Resultado: " + num/den);
        }
        scanner.close();
    }
}
