package Condicionais;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número interio: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número interio: ");
        int num2 = entrada.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Os números em ordem ao contrário " + num1 + " e " + num2);
    }
}
