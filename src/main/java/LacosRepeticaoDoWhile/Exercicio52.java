package LacosRepeticaoDoWhile;

public class Exercicio52 {
    public static void main(String[] args) {
        //52) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "do-while".

        int contador = 1;
        int soma = 0;

        do {
            soma += contador;
            contador++;
        } while (contador <= 100);
        System.out.println(soma);
    }
}
