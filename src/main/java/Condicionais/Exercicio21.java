package Condicionais;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        //21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.

        Scanner entrada = new Scanner(System.in);
        int menores = 0;
        int maiores = 0;

        System.out.print("Digite o número de pessoas no grupo: ");
        int numeroDePessoas = entrada.nextInt();

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = entrada.nextInt();
            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }
        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);
    }
}
