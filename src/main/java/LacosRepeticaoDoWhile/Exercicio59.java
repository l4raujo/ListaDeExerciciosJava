package LacosRepeticaoDoWhile;

public class Exercicio59 {
    public static void main(String[] args) {
        //59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "do-while" e exiba a média das idades.

        int contador = 1;
        int soma = 0;
        String nome = "";
        int idade = 0;
        do {
            System.out.println("Digite o nome da pessoa: " + contador);
            nome = System.console().readLine();
            System.out.println("Digite a idade da pessoa: " + contador);
        } while (contador <= 5);
    }
}
