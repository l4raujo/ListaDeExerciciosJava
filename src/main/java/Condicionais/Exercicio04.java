package Condicionais;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // 4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = entrada.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = entrada.nextInt();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        int somaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

        int somaPesos = peso1 + peso2 + peso3;
        double media = (double) somaPonderada / somaPesos;

        System.out.printf("A média ponderada é: %.2f%n", media);

    }
}
