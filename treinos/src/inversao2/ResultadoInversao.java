package inversao2;

import inversao.Inversao;

public class ResultadoInversao {

	public static void main(String[] args) {
		
		String inicial = "0lá P3ss0a7!";
		String invertida = Inversao.inverter(inicial);
		System.out.println("String inicial: " + inicial);
		System.out.println("String invertida(somente letras): " + invertida);
	}

}
