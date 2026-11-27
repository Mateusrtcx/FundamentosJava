package aula2.exercicios;
import java.util.Scanner;
public class CalculoTriangulo {

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite a base do triangulo");
        double base= scanner.nextDouble();
        System.out.println("digite sua altura");
        double altura= scanner.nextDouble();


        double  area= (base*altura)/2;
        System.out.println("A area do triangulo é "+ area);






    }











}
