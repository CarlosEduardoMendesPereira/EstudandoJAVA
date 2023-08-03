package aula_0208;

// POO (Programação Orientada a Objetos)
//  Classes -> Fruta (Modelagem)
//  Objetos -> Maçã, Pera, Banana, Goiaba
//  Instãncia -> Processo que constrói um objeto a partir de uma classe
//  Atributo/Propriedade -> Um valor definido na classe incorporado no objeto
//  Métodos/Funções -> Uma rotina/procedimento/tarefa que é feito pelo objeto
public class Fruta {

    String nome;

    String cor;

    float acidez;

    boolean suculencia = false;

    boolean maduro = false;

    String[] vitaminas;

    void amadurecer(int dias) {
        maduro = true;
    }
}