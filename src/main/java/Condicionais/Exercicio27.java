package Condicionais;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        //27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem indicando se ela pode ou não se aposentar. Homens podem se aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu sexo (M ou F):");
        char sexo = entrada.next().charAt(0);

        if (idade >= 65 && sexo == 'M') {
            System.out.println("Você pode se aposentar!");
        } else if (idade >= 60 && sexo == 'F') {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você ainda não pode se aposentar");
        }
    }
}
