package LacosFor;

public class Exercicio72 {
    public static void main(String[] args) {
        //72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.

        int numero = 29;
        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
