package aula2.exercicios;
import java.util.Scanner;
public class CalculoHorasextras {


    static void main(String[] args) {

        System.out.println("========CALCULO DE HORAS EXTRAS==========");
            Scanner scanner=  new Scanner(System.in);


        System.out.println("DIGITE AS HORAS TRABALHADAS");
        double horas= scanner.nextDouble();
        double valorHora=090.0*horas;
        System.out.println("seu salario é "+ valorHora);

        System.out.println("=============================");


        if (horas>40){

            valorHora=0180.0*horas;
            System.out.println("SEU SALARIO MAIS EXTRA É " + valorHora);
        }









    }





}