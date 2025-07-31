import java.util.Scanner;

public class tabuada{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para calcular a tabuada de 1 a 100: ");
        int valor = entrada.nextInt();

        //Inicializando as variáveis
        int i, result = 0;

        entrada.close();
        
        System.out.println("-------------------------------------------------");
        System.out.println("A tabuada do " + valor + " é: ");
        System.out.println("-------------------------------------------------");
        
        //Loop para multiplicar o valor por todos os números de 1 a 100
        for(i = 1; i <= 100; i++){

            //Aqui ele multiplica o valor pelo i, que vai mudando de 1 a 100
            result = valor * i;

            //Aqui imprimi a tabuada
            System.out.println(valor + " x " + i + " = " + result);

        }

        System.out.println("-------------------------------------------------");

    }
}
