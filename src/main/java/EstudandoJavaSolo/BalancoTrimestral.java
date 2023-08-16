package EstudandoJavaSolo;

import java.sql.SQLOutput;

public class BalancoTrimestral {
    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaPorMes = gastosTrimestre / 3;
        System.out.println("Os gastos do TRIMESTRE FOI DE: " + gastosTrimestre);
        System.out.println("Com a média por mes de: " + mediaPorMes);


    }
}
