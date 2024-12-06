package LacosRepeticaoWhile;

public class Exercicio46 {
    public static void main(String[] args) {
        //46) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "while".

        int number = 10;
        int i = 1;
        int soma = 0;

        while (i <= number){
            if (i % 2 == 0){
                soma += i;
            }
            i++;
        }
        System.out.println(soma);
    }
}
