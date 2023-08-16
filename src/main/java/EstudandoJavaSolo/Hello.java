package EstudandoJavaSolo;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello-World!");

        int idade = 20;
        double salario = 45000.99;
        long populacaoTerra = 7900000000L;
        boolean tarefaConcluida = true;
        String nomeCompleto = "Joao Alves";
        // teste comentário
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(populacaoTerra);
        System.out.println(tarefaConcluida);
        System.out.println(nomeCompleto);

        int num1 = 2 + 2;
        int num2 = 5 - 2;
        int num3 = 4 * 2;
        int num4 = 64 / 4;
        int num5 = 5 % 2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        float legacyNum = 20.4F;
        double pi = 3.14;
        double x = 5.5 * 10.25;

        System.out.println(legacyNum);
        System.out.println(pi);
        System.out.println(x);

        //<tipo>  <variavel> = <valor>;
//        ClasseCarro carro = new ClasseCarro();
//        carro.andar();

        double d3 = 3.14;
        int i = (int) d3;
        System.out.println(i);
    }
}
