package Vetores;

public class Exercicio83 {
    public static void main(String[] args) {
        //83)Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.

        int[] numeros = {5, 5, 5, 6, 6, 6, 6};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A média dos númerso são: " + (soma / numeros.length));
    }
}
