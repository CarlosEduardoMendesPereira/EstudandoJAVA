package AtividadePessoais;

public class Troco {
    public static void main(String[] args) {

        double prodUnitario = 8.0;
        int quantCompra = 2;
        double dinheiroReceb = 10.00;
        double troco = 0;
        double insuf = 0;

        double calc = prodUnitario * quantCompra;

        if(dinheiroReceb >= calc) {
            troco = dinheiroReceb - calc;
            System.out.println("TROCO: " + troco);
        }
        else if(dinheiroReceb < calc) {
            insuf = calc - dinheiroReceb;
            System.out.println("DINHEIRO INSUFICIENTE, FALTA: " + insuf);
        }
    }
}
