package Matrizes;

public class Exercicio106 {
    public static void main(String[] args) {
        //106)Escreva um programa que leia duas matrizes 2x2 de números inteiros e verifique se elas são iguais.

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{1, 2}, {3, 4}};
        boolean iguais = true;

        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                if (matriz1[i][n] != matriz2[i][n]) {
                    iguais = false;
                    break;
                }
            }
        }
        System.out.println("As matrizes são iguais: " + iguais);
    }
}
