package aula2.exercicios;
import java.util.Scanner;
public class VerificacaoPrimos {







        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            } else {

                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " NÃO é primo.");
            }

            scanner.close();
        }
    }
