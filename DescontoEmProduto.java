package aula2.exercicios;
import java.util.Scanner;
public class DescontoEmProduto {

    static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        System.out.println("Digite o valor da sua compra");
        int Compra = scanner.nextInt();


        if (Compra > 100) {

            Compra = (int) (Compra * 0.9);
        }

        System.out.println("Valor final: " + Compra);

    }









    }











