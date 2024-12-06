package LacosRepeticaoDoWhile;

public class Exercicio54 {
    public static void main(String[] args) {
        //54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e exiba a média aritmética dos valores lidos.

        int soma = 0;
        int contador = 1;
        int numero;

        do {
            numero = (int) (Math.random() * 100);
            soma += numero;
            contador++;
        } while (contador <= 5);

        double media = soma / 5.0;
        System.out.println("A média aritmética dos números é: " + media);
    }
}
