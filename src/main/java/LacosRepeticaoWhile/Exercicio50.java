package LacosRepeticaoWhile;

public class Exercicio50 {
    public static void main(String[] args) {
        //50) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.

        String nome = "ricardo";
        int idade = 20;
        int somaIdade = 0;
        int contador = 0;

        while(!nome.equals("fim")) {
            System.out.println("Digite o nome: ");
            nome = System.console().readLine();
            System.out.println("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());
        }
    }
}
