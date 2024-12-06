package Vetores;

public class Exercicio87 {
    public static void main(String[] args) {
        //87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.

        int[] numeros = {10, -3, 14, 7, -8, 0, 22, 18, -5, 6};
        int positivos = 0;

        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Quantidade de positivos: " + positivos);
    }
}
