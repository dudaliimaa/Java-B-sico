package fatorial;

public class Fatorial {

	public static int fat(int num) {
		
		// Condição para parar
		if(num <= 0) {
			return 1;
		}
		
		// Retorna a própria função
		return num * fat(num -1);

	}

}
