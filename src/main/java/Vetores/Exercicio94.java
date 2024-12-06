package Vetores;

public class Exercicio94 {
    public static void main(String[] args) {
        //94) Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.

        int[] numeros = {6, 15, 8, 23, 12, 19, 24};

        System.out.print("Números pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
