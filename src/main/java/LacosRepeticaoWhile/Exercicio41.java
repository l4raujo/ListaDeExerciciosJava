package LacosRepeticaoWhile;

public class Exercicio41 {
    public static void main(String[] args) {
        //41) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while".

        int number = 10;
        int i = 1;

        while (i <= number){
            if (number % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
