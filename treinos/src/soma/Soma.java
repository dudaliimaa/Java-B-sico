package soma;

public class Soma {
	
	public static int somaNaturais(int num) {
		
		if(num <= 1) {
			return num;
		}
		
		return num + somaNaturais(num - 1);
	}
}
