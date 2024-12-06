package Condicionais;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        //24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = entrada.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3 + ".");
    }
}
