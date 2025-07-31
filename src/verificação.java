import java.util.Scanner;

public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um número para a verificação: ");
    int num = entrada.nextInt();

    if (num % 2 == 0) {
        System.out.println("O número digitado é par.");
    } else {
        System.out.println("O número digitado é ímpar.");
    }

    entrada.close();
    
}
