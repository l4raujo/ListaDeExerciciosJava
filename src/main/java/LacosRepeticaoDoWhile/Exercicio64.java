package LacosRepeticaoDoWhile;

public class Exercicio64 {
    public static void main(String[] args) {
        //64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".

        int fatorial = 1;
        int numero = 5;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);
        System.out.println(fatorial);
    }

}
