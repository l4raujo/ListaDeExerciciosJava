package Vetores;

public class Exercicio82 {
    public static void main(String[] args) {
        //82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos número são: " + soma);
    }
}
