package Vetores;
import java.util.Arrays;

public class Exercicio92 {
    public static void main(String[] args) {
        //92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.

        int[] numeros = {15, 42, 8, 23, 19};

        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
