package aula2.exercicios;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("===========BOLETIM ESCOLAR===============");

        double nota;

        System.out.println("Digite sua nota: ");
        nota = scanner.nextDouble();


        if (nota >= 7.0) {
            System.out.println("Aprovado!");
        }

        else if (nota >=5) {

            System.out.println("Recuperacao");

        }

        else {

            System.out.println("Reprovado");

        }




        scanner.close();
    }
}











