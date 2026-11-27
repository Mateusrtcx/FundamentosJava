package aula2.exercicios;
import java.util.Scanner;

public class ConversaoDeMoeda {

    public static void main(String[] args) {

        System.out.println("======CONVERSOR DE MOEDA=======");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais (R$):");
        double valorReais = scanner.nextDouble();
        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double valorDolar = valorReais / 5.03;
                System.out.printf("Valor convertido: $ %.2f\n", valorDolar);
                break;

            case 2:
                double valorEuro = valorReais / 5.60;
                System.out.printf("Valor convertido: € %.2f\n", valorEuro);
                break;

            case 3:
                double valorLibra = valorReais / 6.62;
                System.out.printf("Valor convertido: £ %.2f\n", valorLibra);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}



