package LacosFor;

public class Exercicio74 {
    public static void main(String[] args) {
        //74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.

        String[] nomes = {"Beatriz", "Ricard", "Gustavo", "Rapha", "Paulo"};
        int[] idades = {22, 20, 21, 19, 22};
        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
        }
        double mediaIdades = somaIdades / 5.0;

        System.out.println("A média das idades é: " + mediaIdades);
    }
}
