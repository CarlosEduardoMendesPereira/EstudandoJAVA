package aula_1508.heranca;

import java.time.LocalDate;

public class Carne extends Comida {

    private String categoria;

    public Carne() {
        super();
    }

    public Carne(String nome, Float preco, String codigo, LocalDate prazoValidade, Float caloria, String categoria) {
        super(nome, preco, codigo, prazoValidade, caloria);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
