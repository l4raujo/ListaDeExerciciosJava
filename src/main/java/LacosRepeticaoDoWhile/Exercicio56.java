package LacosRepeticaoDoWhile;

public class Exercicio56 {
    public static void main(String[] args) {
        //56) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "do-while".

        int numero = 50;
        int divisor = 1;

        if(numero > 0){
            do {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            } while (divisor <= numero);
        }
    }
}
