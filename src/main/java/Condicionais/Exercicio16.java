package Condicionais;
import java.util.Scanner;


public class Exercicio16 {
    public static void main(String[] args) {
        //16) Faça um programa que verifique se um número é positivo, negativo ou zero.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }
    }
}
