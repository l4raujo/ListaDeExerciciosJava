package LacosFor;

public class Exercicio71 {
    public static void main(String[] args) {
        //71) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.

        int numero = 50;

        if (numero <= 0) {
            System.out.println("Digite um número inteiro:.");
        } else {
            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
