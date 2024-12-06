package Vetores;
import java.util.Arrays;

public class Exercicio95 {
    public static void main(String[] args) {
        //95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.

        String[] nomes = {"Carlos", "Ana", "Beatriz", "Eduardo", "Daniel"};

        Arrays.sort(nomes);
        System.out.println("Nomes em ordem alfabética: " + Arrays.toString(nomes));
    }
}
