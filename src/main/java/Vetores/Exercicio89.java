package Vetores;

public class Exercicio89 {
    public static void main(String[] args) {
        //89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a quantidade de números negativos.

        int[] numeros = {12, -9, 7, -4, 0, 15, -3, 20, -6, 8};
        int positivos = 0, negativos = 0;

        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        }
        System.out.println("Positivos: " + positivos + ", Negativos: " + negativos);
    }
}
