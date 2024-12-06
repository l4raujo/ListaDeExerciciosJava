package Condicionais;
import java.util.Scanner;


public class Exercicio25 {
    public static void main(String[] args) {
        //25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de faltas do aluno: ");
        int faltas = entrada.nextInt();

        if (faltas > 15) {
            System.out.println("O aluno foi reprovado por falta.");
        } else {
            System.out.println("O aluno foi aprovado.");
        }
    }
}
