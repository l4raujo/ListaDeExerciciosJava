package Condicionais;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        //28) Faça um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC) e a sua classificação. Considere a tabela de classificação do IMC.

        float peso, altura, imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("Digite a sua altura: ");
        altura = entrada.nextFloat();

        imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else if (imc >= 40){
            System.out.println("Obesidade grau 3");
        } else {
            System.out.println("Digite um peso e/ou altura correta");
        }
    }
}
