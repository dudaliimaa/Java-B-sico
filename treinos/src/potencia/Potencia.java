package potencia;

public class Potencia {
	
	public static int calcularPotencia(int base, int expoente) {
		
		if(expoente == 0) {
			
			return 1;
			
		} if(expoente < 0) {
			
			throw new IllegalArgumentException("O expoente não pode ser negativo!");
		}
		
		return base * calcularPotencia(base, expoente - 1);
	}
}
