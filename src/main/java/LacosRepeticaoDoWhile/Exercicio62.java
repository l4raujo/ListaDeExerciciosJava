package LacosRepeticaoDoWhile;

public class Exercicio62 {
    public static void main(String[] args) {
        //62) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "do-while".

        int contador = 1;

        do {
            System.out.println(contador);
            contador +=2;
        } while (contador <= 50);

    }
}
