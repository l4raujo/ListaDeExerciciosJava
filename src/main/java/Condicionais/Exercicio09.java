package Condicionais;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = entrada.nextDouble();

        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + (taxaJurosMensal / 100));
        }
        System.out.printf("O montante após 12 meses é: R$%.2f%n", montante);
    }
}
