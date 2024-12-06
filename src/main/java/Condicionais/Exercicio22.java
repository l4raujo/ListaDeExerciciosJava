package Condicionais;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        //22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: ");
        double salario = entrada.nextDouble();

        double bonus = (salario > 2000) ? salario * 0.10 : salario * 0.05;

        System.out.println("O bônus do funcionário é: " + bonus);
    }
}
