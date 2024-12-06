package LacosRepeticaoWhile;

public class Exercicio47 {
    public static void main(String[] args) {
        //47) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".

        int contador = 1;

        while(contador <= 50) {
            if(contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
