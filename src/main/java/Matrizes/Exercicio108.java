package Matrizes;

public class Exercicio108 {
    public static void main(String[] args) {
        //108)Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.

        int[][] matriz = {
                {1, 8, 3, 4},
                {5, 2, 7, 6},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int n = 1; n < 4; n++) {
                if (matriz[i][n] > maior) {
                    maior = matriz[i][n];
                }
            }
            System.out.println("Maior valor da linha " + i + ": " + maior);
        }
    }
}
