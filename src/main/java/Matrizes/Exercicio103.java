package Matrizes;

public class Exercicio103 {
    public static void main(String[] args) {
        //103) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o menor valor presente na matriz.

        int[][] matriz = {
                {9, 5, 3},
                {7, 2, 8},
                {4, 6, 1}
        };
        int menor = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                if (matriz[i][n] < menor) {
                    menor = matriz[i][n];
                }
            }
        }
        System.out.println("O menor valor é: " + menor);
    }
}
