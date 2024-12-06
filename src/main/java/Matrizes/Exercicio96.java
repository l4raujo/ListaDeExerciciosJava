package Matrizes;

public class Exercicio96 {
    public static void main(String[] args) {
        // 96) Faça um programa que leia uma matriz 3x3 de números inteiros e exiba a matriz na tela.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                System.out.print(matriz[i][n] + " ");
            }
        }
    }
}
