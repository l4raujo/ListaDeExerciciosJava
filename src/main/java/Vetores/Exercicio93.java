package Vetores;

public class Exercicio93 {
    public static void main(String[] args) {
        //93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10 a 50.

        int[] numeros = {5, 12, 45, 8, 23, 33, 50, 60, 9, 41};
        int noIntervalo = 0;

        for (int num : numeros) {
            if (num >= 10 && num <= 50) {
                noIntervalo++;
            }
        }
        System.out.println("Quantidade no intervalo [10, 50]: " + noIntervalo);
    }
}
