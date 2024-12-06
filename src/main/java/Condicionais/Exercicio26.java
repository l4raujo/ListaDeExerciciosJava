package Condicionais;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        /*26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.*/

        Scanner entrada = new Scanner(System.in);

        float precoProduto1 = 10.0f;
        float precoProduto2 = 20.0f;
        float precoProduto3 = 30.0f;

        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigo = entrada.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        float total = 0;

        switch (codigo) {
            case 1:
                total = precoProduto1 * quantidade;
                break;
            case 2:
                total = precoProduto2 * quantidade;
                break;
            case 3:
                total = precoProduto3 * quantidade;
                break;
            default:
                System.out.println("Código de produto inválido.");
                return;
        }
        System.out.println("O valor total a ser pago é: " + total);
    }
}
