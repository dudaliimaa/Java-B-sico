package inversao;

public class Inversao {
	
	public static String inverter(String frase) {
		
		frase = frase.replaceAll("[^a-zA-Z]", "");
		
		if(frase.length() <= 1) {
			return frase;
		}
		
		return frase.charAt(frase.length() - 1) + inverter(frase.substring(1, frase.length() -1)) + frase.charAt(0);
	}

}
