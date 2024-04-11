package eclipse;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
		Scanner instance = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String name = instance.nextLine();
		System.out.println("Digite a sua idade: ");
		String age = instance.nextLine();
		System.out.println("Digite a cidade em que voce vive: ");
		String city = instance.nextLine();
		System.out.println();
		System.out.println(name+age+city);
		instance.close();
		}
}