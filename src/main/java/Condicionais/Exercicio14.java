package Condicionais;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        //14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int anos = entrada.nextInt();

        System.out.println("Digite quantos meses tem: ");
        int meses = entrada.nextInt();

        System.out.println("Digite quantos dias: ");
        int dias = entrada.nextInt();

        int idade = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem " + idade + " dias vividos");
    }
}
