package Matrizes;

public class Exercicio97 {
    public static void main(String[] args) {
        //97) Escreva um programa que leia uma matriz 2x2 de números inteiros e calcule a soma de todos os elementos.

        int[][] matriz = {
                {1, 2},
                {3, 4}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                soma += matriz[i][n];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
