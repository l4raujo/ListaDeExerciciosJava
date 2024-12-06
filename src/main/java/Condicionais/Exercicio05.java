package Condicionais;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        //5) Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        float preco = entrada.nextFloat();
        System.out.println("Digite a quantidade de produto :");
        int quantidade = entrada.nextInt();


        if (quantidade > 10) {
            float total = preco * quantidade;
            float totalComDesconto = (float) (total - (total * 0.10));
            System.out.println("O valor total dos produtos com desconto de 10% é: " + totalComDesconto);
        } else if (quantidade <= 10) {
            System.out.println("O valor total dos produtos sem desconto é: " + preco * quantidade);
        } else {
            System.out.println("Digite um valor e/ou quantidade correta");
        }
    }
}
