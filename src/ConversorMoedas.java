import java.util.Scanner;
public class ConversorMoedas {
    double taxaDolar = 5.00;
    double taxaEuro = 5.50;
    double taxaLibra = 6.30;
    double taxaPesoArgentino = 0.0037;

    double converterParaDolar (double valor) {
        return valor / taxaDolar;
    }

    double converterParaEuro (double valor) {
        return valor / taxaEuro;
    }

    double converterParaLibra (double valor) {
        return valor / taxaLibra;
    }

    double converterParaPesoArgentino (double valor) {
        return valor / taxaPesoArgentino;
    }






}
