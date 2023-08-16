package EstudandoJavaSolo;

public class Booleans {
    public static void main(String[] args) {

//        int idade = 15;
//
//        if(idade < 18) {
//            System.out.println("Não pode entrar");
//        }
//        else {
//            System.out.println("Pode entrar");
//        }

        int idade = 15;
        boolean amigoDoDono = true;

        if(idade < 18 && amigoDoDono == false) {
            System.out.println("Não pode entrar");
        }
        else {
            System.out.println("Pode entrar");
        }

        int mes = 1;

        // (!=) para dizer que é diferente no código
        if(mes == 1) {
            System.out.println("Você deveria estar de ferias");
        }
        else {
            System.out.println("Você não está de férias");
        }
    }
}
