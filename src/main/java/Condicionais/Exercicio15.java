package Condicionais;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        float salario = entrada.nextFloat();

        float aumento = (float) (salario * 1.15);

        System.out.println("Seu novo salário com aumento de 15% é R$:" + aumento + "");
    }
}
