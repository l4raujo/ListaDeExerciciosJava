package LacosFor;

public class Exercicio77 {
    public static void main(String[] args) {
        //77) Crie um programa que exiba os números ímpares de 50 a 1.

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
