package aula_1508.heranca;

public class Livro extends Produto {

    // pai -> superclasse -> Produto
    // filho -> subclasse -> Livro
    private int numPaginas;
    private String isbn;

    public Livro() {
        super(); // construtor da classe pai
    }

    public Livro(String nome, Float preco, String codigo, int numPaginas, String isbn) {
        super(nome, preco, codigo); // construtor dea classe pai que recebe os parametros
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
