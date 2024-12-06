package LacosFor;

public class Exercicio76 {
    public static void main(String[] args) {
        //76) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido.

        int num = 50;
        int somaPares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }
        System.out.println("A soma dos números pares entre 1 e " + num + " é: " + somaPares);
    }
}
