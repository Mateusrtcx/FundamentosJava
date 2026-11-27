package aula2.exercicios;
import java.util.Scanner;
public class ProvaNota {


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua primeira nota");
        int Nota1 = scanner.nextInt();
        System.out.println("Digite sua segunda nota");
        int Nota2 = scanner.nextInt();
        System.out.println("Digite sua terceira nota");
        int Nota3 = scanner.nextInt();
        double media = Nota1 + Nota2 + Nota3 / 3;

        System.out.println("=======SUA MEDIA DE NOTAS=========");
        System.out.println("Sua media é: " + media);


    }


}





