package fibonacci2;

import fibonacci.Fibonacci;

public class ResultadoFibonacci {
	
	public static void main(String[] args) {
		
		int numero = 10;
		int resultado = Fibonacci.calcularFibonacci(numero);
		System.out.println("O " + numero + "-ésimo número da sequência de Fibonacci é: " + resultado);
	}

}
