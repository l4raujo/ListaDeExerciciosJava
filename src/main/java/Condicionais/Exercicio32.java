package Condicionais;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        //32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a sua conceituação conforme a tabela de notas.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = entrada.nextInt();

        String conceito;
        if (nota >= 10) {
            conceito = "A";
        } else if (nota >= 7) {
            conceito = "B";
        } else if (nota >= 6) {
            conceito = "C";
        } else if (nota >= 5) {
            conceito = "D";
        } else {
            conceito = "F";
        }

        System.out.println("Conceito: " + conceito);
    }
}
