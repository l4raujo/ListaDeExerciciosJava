package Vetores;

public class Exercicio85 {
    public static void main(String[] args) {
        //85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor valor digitado.

        int[] numeros = {5, 6, 7, 8, 9};
        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior: " + maior + ", Menor: " + menor);
    }
}
