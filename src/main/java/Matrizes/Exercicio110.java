package Matrizes;

public class Exercicio110 {
    public static void main(String[] args) {
        //110) Crie um programa que leia duas matrizes 2x2 de números inteiros e exiba a subtração entre elas.

        int[][] matriz1 = {{8, 6}, {4, 2}};
        int[][] matriz2 = {{1, 3}, {5, 7}};
        int[][] subtracao = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                subtracao[i][n] = matriz1[i][n] - matriz2[i][n];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                System.out.print(subtracao[i][n] + " ");
            }
            System.out.println();
        }
    }
}
