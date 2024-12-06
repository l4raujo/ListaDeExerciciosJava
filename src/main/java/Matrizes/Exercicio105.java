package Matrizes;

public class Exercicio105 {
    public static void main(String[] args) {
        //105) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba a soma dos elementos de cada coluna.

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int n = 0; n < 4; n++) {
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                soma += matriz[i][n];
            }
            System.out.println("Soma da coluna " + n + ": " + soma);
        }
    }
}
