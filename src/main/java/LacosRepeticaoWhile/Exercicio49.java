package LacosRepeticaoWhile;

public class Exercicio49 {
    public static void main(String[] args) {
        //49) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "while".

        int numero = 5;
        int fatorial = 1;
        int contador = numero;

        while (contador > 0) {
            fatorial *= contador;
            contador--;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
