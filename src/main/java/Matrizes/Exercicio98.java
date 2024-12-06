package Matrizes;

public class Exercicio98 {
    public static void main(String[] args) {
        //98) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a soma dos elementos da diagonal principal.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
