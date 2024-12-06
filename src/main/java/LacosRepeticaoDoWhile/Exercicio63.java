package LacosRepeticaoDoWhile;
import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        //63) Faça um programa que tenha um número inteiro e exiba os seus dígitos separadamente usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = entrada.nextInt();
        int tempNumber = number;

        do {
            int digito = tempNumber % 10;
            System.out.println(digito);
            tempNumber /= 10;
        } while (tempNumber != 0);
    }
}
