package LacosFor;

public class Exercicio79 {
    public static void main(String[] args) {
        //79) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário.

        int num = 50;
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
