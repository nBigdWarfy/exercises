package eclipse;

import java.util.Scanner;

public class exe11 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = i * i;
            int c = i * i * i;
            System.out.println(a + " " + b + " " + c);
        }
        scanner.close();
    }
}