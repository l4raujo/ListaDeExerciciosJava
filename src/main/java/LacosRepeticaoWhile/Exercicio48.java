package LacosRepeticaoWhile;

public class Exercicio48 {
    public static void main(String[] args) {
        //)Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "while".
        int numero = 12345;
        int resto;

        System.out.println("Os dígitos do número " + numero + " são:");

        while (numero > 0) {
            resto = numero % 10;
            System.out.println(resto);
            numero = numero / 10;
        }
    }
}
