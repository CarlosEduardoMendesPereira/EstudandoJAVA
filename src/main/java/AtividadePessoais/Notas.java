package AtividadePessoais;

public class Notas {
    public static void main(String[] args) {
        double nota1 = 45.5;
        double nota2 = 31.3;

        if(nota1 + nota2 < 60) {
            System.out.println("ATENÇÃO VOCÊ REPROVOU!");
        }
        else {
            System.out.println("APROVADO!");
        }
    }
}
