package Vetores;

public class Exercicio81 {
    public static void main(String[] args) {
        //81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.

        int[] numero = {4, 5, 6, 7, 8};

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
