package AtividadePessoais;

public class MenorDeTres {
    public static void main(String[] args) {
        int valor1 = 7;
        int valor2 = 3;
        int valor3 = 8;
        int menor = 0;
        int maior = 0;

        if(valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        }
        else if(valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        }
        else {
            menor = valor3;
        }
        System.out.println("O menor valor é: " + menor);

        if(valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        }
        else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        }
        else {
            maior = valor3;
        }
        System.out.println("O maior valor é: " + maior);
    }
}
