package Condicionais;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        //35) Escreva um programa que leia três números inteiros e exiba a média aritmética. Se a média for maior ou igual a 7, exiba a mensagem "Aprovado", caso contrário, exiba a mensagem "Reprovado".

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = entrada.nextInt();

        int media = (num1 + num2 + num3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
