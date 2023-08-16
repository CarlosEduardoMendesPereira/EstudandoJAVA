package aula_1508.heranca;

import java.time.LocalDate;

public class Comida extends Produto {

    private LocalDate prazoValidade;
    private Float caloria;

    public Comida() {
        super();
    }

    public Comida(String nome, Float preco, String codigo, LocalDate prazoValidade, Float caloria) {
        super(nome, preco, codigo);
        this.prazoValidade = prazoValidade;
        this.caloria = caloria;
    }

    public LocalDate getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(LocalDate prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public Float getCaloria() {
        return caloria;
    }

    public void setCaloria(Float caloria) {
        this.caloria = caloria;
    }
}
