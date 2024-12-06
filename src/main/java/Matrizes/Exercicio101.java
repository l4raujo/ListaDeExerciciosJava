package Matrizes;

public class Exercicio101 {
    public static void main(String[] args) {
        //101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int soma = 0;
        int totalElementos = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                soma += matriz[i][n];
            }
        }
        double media = (double) soma / totalElementos;
        System.out.println("Média: " + media);
    }

}
