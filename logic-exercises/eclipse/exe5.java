package eclipse;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int a = scanner.nextInt();

        while (a != 0) {
            if (a >= 10 && a <= 20) { 
                System.out.println(a + " in");
            } else if (a < 10 || a > 20) {
                System.out.println(a + " out");
            }
            System.out.println("Digite um número: ");
            a = scanner.nextInt();
        }
        scanner.close();
    }
}