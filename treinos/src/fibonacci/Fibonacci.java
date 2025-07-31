package fibonacci;

public class Fibonacci {
	
	public static int calcularFibonacci(int num) {
		 if(num == 0 || num == 1) {
			 return num;
		 }	
		 
		 return calcularFibonacci(num -1) + calcularFibonacci(num - 2);
	}
}
