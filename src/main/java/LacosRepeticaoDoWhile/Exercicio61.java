package LacosRepeticaoDoWhile;
import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        //61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int soma = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= numero);

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
    }
}
