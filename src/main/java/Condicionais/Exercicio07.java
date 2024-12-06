package Condicionais;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        //7) Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = entrada.nextDouble();

        float comissao = (float) (salario * 0.05);
        float salarioLiquido = (float) (salario + comissao);

        System.out.println("O seu salário líquido é: " + salarioLiquido);
    }
}
