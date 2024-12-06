package Vetores;
import java.util.Arrays;

public class Exercicio86 {
    public static void main(String[] args) {
        //86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.

        int[] numeros = {34, 7, 23, 32, 5, 62, 19, 3, 45, 8};
        Arrays.sort(numeros);
        System.out.println("Ordem crescente: " + Arrays.toString(numeros));
    }
}
