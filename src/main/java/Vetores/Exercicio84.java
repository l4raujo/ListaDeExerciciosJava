package Vetores;

public class Exercicio84 {
    public static void main(String[] args) {
        //84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.

        int[] numeros = {10, 21, 32, 43, 54};
        int pares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
    }
}
