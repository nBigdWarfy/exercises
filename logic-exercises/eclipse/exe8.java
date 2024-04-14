package eclipse;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de vezes que deseja realizar a operação: ");
        float n = scanner.nextFloat();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores: ");
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            float z = scanner.nextFloat();
    
            float result = (x*2 + y*3 + z*5)/10;
            System.out.println("Resultado: " + result);
        }
        scanner.close();
    }
}
