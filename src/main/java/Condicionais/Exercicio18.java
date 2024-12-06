package Condicionais;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //18) Crie um programa que leia dois números inteiros e exiba o maior deles.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número digitado foi " + num1);
        } else if(num2 > num1) {
            System.out.println("O maior número digitado foi " + num2);
        } else  {
            System.out.println("Digite os números corretamente");
        }
    }
}
