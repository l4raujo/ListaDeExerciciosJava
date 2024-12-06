package LacosRepeticaoWhile;

public class Exercicio42 {
    public static void main(String[] args) {
        //42) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while".

        int number = 5;
        int i = 2;
        boolean isPrime = true;

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime && number > 1) {
            System.out.println("Esse número é primo");
        } else {
            System.out.println("Esse número não é primo");
        }
    }

}
