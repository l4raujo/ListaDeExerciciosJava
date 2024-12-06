package LacosRepeticaoWhile;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        //39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while (contador < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            soma += numero;
            contador++;
        }

        double media = (double) soma / 5;
        System.out.println("A média dos números é: " + media);
    }
}
