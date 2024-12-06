package Condicionais;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // 3) Crie um programa que leia a base e a altura de um triângulo e calcule sua área.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        int base = entrada.nextInt();
        System.out.print("Digite a altura do triângulo: ");
        int altura = entrada.nextInt();

        int area = (base * altura) / 2;

        System.out.println("Cálculo da área do triângulo é: " + area);
    }
}
