package Matrizes;

public class Exercicio107 {
    public static void main(String[] args) {
        //107) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba o produto dos elementos da diagonal secundária.

        int[][] matriz = {
                {2, 1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int produto = 1;

        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][2 - i];
        }
        System.out.println("O produto da diagonal secundária é: " + produto);
    }
}
