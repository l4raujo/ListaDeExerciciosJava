package LacosRepeticaoWhile;

public class Exercicio43 {
    public static void main(String[] args) {
        //43) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "while".

        int number = 10;
        int i = 1;
        int j = 0;
        int k = 0;
        while (i <= number){
            k = j + i;
            System.out.println(k);
            j = i;
            i = k;
        }
    }
}
