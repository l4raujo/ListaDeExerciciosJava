package LacosRepeticaoDoWhile;

public class Exercicio55 {
    public static void main(String[] args) {
        //55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "do-while".

        int number = 5;
        int i =1;
        do {
            System.out.println(number * i);
            i++;
        } while (i <= 10);
    }
}
