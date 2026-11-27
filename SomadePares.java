package aula2.exercicios;
import java.util.Scanner;
public class SomadePares {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int somaPares = 0;
            int contador = 1;

            System.out.println("Soma de números pares. Insira 10 números:");


            while (contador <= 10) {
                System.out.print("Digite o " + contador + "º número: ");
                int numero = scanner.nextInt();


                if (numero % 2 == 0) {
                    somaPares += numero;
                }

                contador++;
            }

            System.out.println("A soma dos números pares é: " + somaPares);
            scanner.close();
        }







}
