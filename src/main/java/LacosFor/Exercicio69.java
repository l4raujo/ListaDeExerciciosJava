package LacosFor;
import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        //69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.

        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            soma += entrada.nextInt();
        }
        double total = soma / 5.0;
        System.out.println("A média aritmética é: " + total);
    }
}
