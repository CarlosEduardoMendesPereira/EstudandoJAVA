package AtividadePessoais;

public class Operadora {
    public static void main(String[] args) {

        int minuto = 500;
        double valor = 50.00;

        if(minuto > 100) {
           valor = (minuto - 100) * 2;
        }
        System.out.println("O valor a pagar é de: " + valor);
    }
}
