package aula2.exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================Calculadora Java==============================");
        System.out.println("DIGITE O PRIMEIRO VALOR:");
        double valor1 = scanner.nextDouble();

        System.out.println("DIGITE O SEGUNDO VALOR:");
        double valor2 = scanner.nextDouble();

        System.out.println("ESCOLHA A OPERACAO (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("O resultado é: " + resultado);
        }

        scanner.close();
    }
}
