package LacosRepeticaoWhile;

public class Exercicio45 {
    public static void main(String[] args) {
        //45) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "while".

        int i = 1;
        int j = 1;
        int k = 0;

        while (i <= 20){
            k = i + j;
            System.out.println(k);
            i++;
            j = k;
        }
    }
}
