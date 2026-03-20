import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConversorMoedas conversor = new ConversorMoedas();

        System.out.println("Digite o valor em reais: ");
        double valor = scanner.nextDouble();

        System.out.println("Escolha a moeda: ");
        System.out.println("1- Dólar");
        System.out.println("2- Euro");
        System.out.println("3- Libra");
        System.out.println("4- Peso Argentino");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double resultado = conversor.converterParaDolar(valor);
            System.out.println("Valor em dólar: $" + resultado);

        } else if (opcao == 2) {
            double resultado = conversor.converterParaEuro(valor);
            System.out.println("Valor em euro: €" + resultado);

        } else if (opcao == 3) {
            double resultado = conversor.converterParaLibra(valor);
            System.out.println("Valor em libra: £" + resultado);

        } else if (opcao == 4) {
            double resultado = conversor.converterParaPesoArgentino(valor);
            System.out.println("Valor em peso argentino: AR$" + resultado);

        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

}


