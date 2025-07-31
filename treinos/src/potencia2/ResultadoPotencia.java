package potencia2;

import potencia.Potencia;

public class ResultadoPotencia {

	public static void main(String[] args) {
		
		int base = 5;
		int expoente = 2;
		int resultado = Potencia.calcularPotencia(base, expoente);
		System.out.println(base + " elevado a " + expoente + " é: " + resultado);
	}

}
