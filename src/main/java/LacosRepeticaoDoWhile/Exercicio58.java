package LacosRepeticaoDoWhile;

public class Exercicio58 {
    public static void main(String[] args) {
        //58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "do-while".

        int a = 0;
        int b = 1;
        int c = 0;
        int numero = 50;

        do {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        } while (c <= numero);
    }
}
