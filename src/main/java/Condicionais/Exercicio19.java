package Condicionais;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        //19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7.

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
