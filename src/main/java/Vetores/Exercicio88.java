package Vetores;

public class Exercicio88 {
    public static void main(String[] args) {
        //88) Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.

        int[] numeros = {12, 15, 8, 23, 30};
        int somaPares = 0, somaImpares = 0, contPares = 0, contImpares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                somaPares += num;
                contPares++;
            } else {
                somaImpares += num;
                contImpares++;
            }
        }
        System.out.println("Média dos pares: " + (contPares > 0 ? somaPares / contPares : 0));
        System.out.println("Média dos ímpares: " + (contImpares > 0 ? somaImpares / contImpares : 0));
    }
}
