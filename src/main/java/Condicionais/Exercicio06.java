package Condicionais;
import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {

        //6) Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }
    }
}
