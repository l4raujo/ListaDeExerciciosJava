package Condicionais;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        //30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o total de maças compradas: ");
        int maca = entrada.nextInt();

        if (maca < 12) {
            System.out.println("O valor total das maças são R$ " + maca * 0.50);
        } else {
            System.out.println("O valor total das maças são R$ " + maca * 0.40);
        }
    }
}
