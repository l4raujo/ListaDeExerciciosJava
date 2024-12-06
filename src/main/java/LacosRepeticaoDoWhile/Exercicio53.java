package LacosRepeticaoDoWhile;

public class Exercicio53 {
    public static void main(String[] args) {
        //53) Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".

        int numero = 2;

        do {
            System.out.println(numero);
            numero += 2;
        } while (numero <= 50);
    }
}
