package Condicionais;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        //10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número(interio) para saber sua tabuada: ");
        int numero = entrada.nextInt();
        int i = 1;
        do {
            int cont = numero  * i;
            System.out.println(numero + " x " + i + " = " + cont);
            i++;
        } while (i <= 10);

    }
}
