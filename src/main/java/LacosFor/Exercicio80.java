package LacosFor;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        //80) Crie um programa que leia o nome e a idade de várias pessoas até que o nome "fim" seja informado. Ao final, exiba a média das idades.

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, somaIdades = 0, contador = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa: ");
            nome = scanner.nextLine();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            idade = Integer.parseInt(scanner.nextLine());

            somaIdades += idade;
            contador++;
        }
        if (contador > 0) {
            double mediaIdades = somaIdades / (double) contador;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
    }
}
