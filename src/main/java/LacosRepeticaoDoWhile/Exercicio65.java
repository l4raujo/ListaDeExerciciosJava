package LacosRepeticaoDoWhile;
import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        //65) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.

        Scanner entrada = new Scanner(System.in);
        String nome;
        int somaIdades = 0;
        int contador = 0;

        do {
            System.out.print("Digite o nome: ");
            nome = entrada.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                int idade = entrada.nextInt();
                entrada.nextLine();
                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.printf("A média das idades é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}
