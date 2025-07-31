import java.util.Scanner;

public class Soma {

    //Método para somar dois números
    public int Somar (int a, int b){  

    return a + b;
    
    }

public static void main (String[] args){
    
    Scanner scanner = new Scanner(System.in);

    // Solicitanjdo os números
    System.out.println("Digite o primeiro valor para a soma: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número para a soma: ");
    int num2 = scanner.nextInt();

    if (num1 < 0 || num2 < 0) {

        System.out.println("O número precisa ser positivo!!!");

    } else {

    //Criando um objeto da classe Soma
    Soma somaObj = new Soma();
    int resultado = somaObj.Somar(num1, num2);

    // Exibindo o resultado
    System.out.println("A soma de " + num1 + " + " + num2 + " é: " + resultado);

    }

    scanner.close();
    
    }
}