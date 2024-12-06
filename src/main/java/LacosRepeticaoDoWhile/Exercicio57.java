package LacosRepeticaoDoWhile;

public class Exercicio57 {
    public static void main(String[] args) {
        //57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".

        int numero = 5;
        int i = 2;
        boolean isPrime = true;

        do {
            if (numero % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i <= Math.sqrt(numero));
        System.out.println(isPrime ? "É primo" : "Não é primo");
    }
}
