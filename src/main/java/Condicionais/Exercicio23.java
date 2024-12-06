package Condicionais;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        //23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome de um mês: ");
        String mes = entrada.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println(mes + " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println(mes + " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println(mes + " tem 28 ou 29 dias.");
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }

    }
}
