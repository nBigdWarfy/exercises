package eclipse;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 1;
        double y = 1;

        while (x != 0 && y != 0) {
            System.out.println("Digite o valor de X: ");
            x = scanner.nextDouble();
            System.out.println("Digite o valor de Y: ");
            y = scanner.nextDouble();

            if (x > 0 && y < 0) {
                System.out.println("Quadrante A");
            } else if (x > 0 && y > 0) {
                System.out.println("Quadrante B");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante C");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante D");
            }
        }
        scanner.close();
    }
}
