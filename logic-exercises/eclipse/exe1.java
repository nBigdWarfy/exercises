package eclipse;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insira a senha: ");
            String answer = scan.nextLine();

            if (answer.equals("2002")) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha inválida!");
            }
            scan.close();
            return;
        }
    }
}