package Condicionais;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        // 1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.

        Scanner numbers = new Scanner(System.in);

        System.out.print("Digite o primeiro número interio: ");
        int num1 = numbers.nextInt();
        System.out.println("Digite o segundo número interio: ");
        int num2 = numbers.nextInt();


        System.out.println("A soma do primeiro e segundo número é: " + (num1 + num2));
        System.out.println("A subtração do primeiro e segundo número é: " + (num1 - num2));
        System.out.println("A multiplicação do primeiro e segundo número é: " + (num1 * num2));
        System.out.println("A divisão do primeiro e segundo número é: " + (num1 / num2));
    }

}
