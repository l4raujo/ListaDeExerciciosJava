package Matrizes;

public class Exercicio100 {
    public static void main(String[] args) {
        //100) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o maior valor presente na matriz.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                if (matriz[i][n] > maior) {
                    maior = matriz[i][n];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}
