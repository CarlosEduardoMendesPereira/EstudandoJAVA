package aula_1508.heranca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.5F, "1579563\n");
        System.out.println(batata.getNome());
        System.out.println(batata.getPreco());
        System.out.println(batata.getCodigo());

        Livro cleanCode = new Livro("Clean Code", 100.00F, "987847324", 300, "123.123.123.123\n");
        System.out.println(cleanCode.getNome());
        System.out.println(cleanCode.getPreco());
        System.out.println(cleanCode.getCodigo());
        System.out.println(cleanCode.getNumPaginas());
        System.out.println(cleanCode.getIsbn());

        Comida tapioca = new Comida("Tapioca", 5.0F, "43564353", LocalDate.of(2023, 9, 12), 100.0F);
        System.out.println(tapioca.getNome());
        System.out.println(tapioca.getPrazoValidade());

        Carne gado = new Carne("Picanha", 100.0F, "3123", LocalDate.of(2023, 12, 8), 200.0F, "Bovina");
        System.out.println(gado.getNome());
        System.out.println(gado.getCategoria());
        System.out.println(gado.getCaloria());
    }
}
