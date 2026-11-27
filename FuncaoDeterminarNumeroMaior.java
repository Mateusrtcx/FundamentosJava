package aula2.exercicios.Funcao;

public class FuncaoDeterminarNumeroMaior {



        public static int maiorNumero(int n1, int n2, int n3) {
            if (n1 >= n2 && n1 >= n3) {
                return n1;
            } else if (n2 >= n1 && n2 >= n3) {
                return n2;
            } else {
                return n3;
            }
        }

        public static void main(String[] args) {
            int maior = maiorNumero(15, 42, 27);
            System.out.println("O maior número é: " + maior);
        }
}







