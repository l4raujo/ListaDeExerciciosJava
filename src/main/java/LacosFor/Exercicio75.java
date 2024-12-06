package LacosFor;

public class Exercicio75 {
    public static void main(String[] args) {
        //75) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.

        int a = 0, b = 1;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: ");

        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
