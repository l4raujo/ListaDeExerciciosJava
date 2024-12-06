package LacosFor;

public class Exercicio73 {
    public static void main(String[] args) {
        //73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.
        int num = 10;
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + num + ": ");

        for (int i = 0; a <= num; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
