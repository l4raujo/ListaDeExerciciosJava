package LacosRepeticaoDoWhile;

public class Exercicio60 {
    public static void main(String[] args) {
        //60) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "do-while".

        int a = 0;
        int b = 1;
        int i = 1;

        do {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
            i++;
        } while (i <= 20);
    }
}
