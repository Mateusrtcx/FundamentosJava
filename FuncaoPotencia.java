package aula2.exercicios.Funcao;

public class FuncaoPotencia {


        public static int calcularPotencia(int base, int expoente) {
            int resultado = 1;

            for (int i = 0; i < expoente; i++) {
                resultado = resultado * base;
            }

            return resultado;
        }







}



