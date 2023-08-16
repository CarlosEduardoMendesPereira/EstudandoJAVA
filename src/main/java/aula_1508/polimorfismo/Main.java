package aula_1508.polimorfismo;

public class Main {
    public static void main(String[] args) {

        // classe Animal é abstrata portanto não pode ser instanciada. Serve somente como modelo para suas classes filhas
        Animal rato = new Animal("Rato", "Mus musculus", "Terrenos Baldios");
        System.out.println(rato.getNome());
        System.out.println(rato.getEspecie());
        System.out.println(rato.getHabitat());

        Gato gato0 - new Gato();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato0.setCorPelo("Marrom");
        System.out.println(gato0.getCorPelo());
//        gato.setCorPelo("Pedreis"); Invalido
//        System.out.println(gato.getCorPelo()); Invalido

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
