package treinos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		System.out.print("Digite o número que deseja calcular a tabuada: ");
		
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		
		System.out.println("\nTabuada do " + valor + ": \n");
		
		for (int i = 0; i <= 10; i++) {
			
			int result = valor * i;
			System.out.println(valor + " x " + i + " = " + result);
		}
		
		scanner.close();
	}

}
