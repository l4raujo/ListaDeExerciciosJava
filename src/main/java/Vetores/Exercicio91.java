package Vetores;

public class Exercicio91 {
    public static void main(String[] args) {
        //91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.

        int[] numeros = {5, -3, 8, -2, 12, -10, 7, -4, 9, -1};
        int somaPositivos = 0, somaNegativos = 0;

        for (int num : numeros) {
            if (num > 0) {
                somaPositivos += num;
            } else if (num < 0) {
                somaNegativos += num;
            }
        }
        System.out.println("Total dos positivos: " + somaPositivos + ", Total dos negativos: " + somaNegativos);
    }
}
