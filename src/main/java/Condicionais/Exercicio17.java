package Condicionais;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        //17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade > 1 && idade < 12) {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade < 19) {
            System.out.println("Você é adolescente");
        } else if (idade >= 19 && idade < 65) {
            System.out.println("Você é adulto");
        } else if (idade > 65) {
            System.out.println("Você é idoso");
        } else {
            System.out.println("Digite uma idade válida");
        }
    }
}
