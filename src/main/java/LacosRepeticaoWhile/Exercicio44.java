package LacosRepeticaoWhile;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        //44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades.

        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        int soma = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            soma += idade;
            contador++;
        }
        double media = (double) soma / 5;
        System.out.printf("A média das idades é: %.2f%n", media);
    }
}
