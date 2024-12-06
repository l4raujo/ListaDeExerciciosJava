package Vetores;

public class Exercicio90 {
    public static void main(String[] args) {
        //90)Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.

        int[] numeros = {3, 0, 7, -1, 5};
        boolean contemZero = false;

        for (int num : numeros) {
            if (num == 0) {
                contemZero = true;
                break;
            }
        }
        System.out.println("Algum dos números é igual à zero: " + contemZero);
    }
}
