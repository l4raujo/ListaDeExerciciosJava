package Condicionais;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        //33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de saudação de acordo com o turno. Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu turno (M/V): ");
        char turno = entrada.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia, " + nome);
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Turno inválido.");
        }
    }
}
