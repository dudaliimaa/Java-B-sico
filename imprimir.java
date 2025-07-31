public class imprimir {

    String mensagem = "Olá, Mundo!";

    void Imprimir() {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        imprimir exibir = new imprimir();
        exibir.Imprimir();
    }
}