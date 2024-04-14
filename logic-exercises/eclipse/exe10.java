package eclipse;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
