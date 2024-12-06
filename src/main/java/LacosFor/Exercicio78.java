package LacosFor;

public class Exercicio78 {
    public static void main(String[] args) {
        //78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.

        int num = 45678;

        int numDigitos = (int) Math.log10(num) + 1;

        System.out.print("Os dígitos de " + num + " são: ");

        for (int i = 0; i < numDigitos; i++) {
            int digito = num / (int) Math.pow(10, numDigitos - i - 1) % 10;
            System.out.print(digito + " ");
        }
    }
}
