package Condicionais;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        //13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digie o primeiro número inteiro: ");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo número interio: ");
        int segundoNumero = entrada.nextInt();

        if (primeiroNumero % segundoNumero == 0) {
            System.out.println("O primeiro número é multiplo pelo segundo número");
        } else {
            System.out.println("O primeiro número não é multiplo do segundo");
        }
    }
}
