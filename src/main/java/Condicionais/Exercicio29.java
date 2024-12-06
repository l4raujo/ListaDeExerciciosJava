package Condicionais;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        //29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina. Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Que pena, você foi reprovado");
        }
    }
}
