package Teste;

import java.util.Scanner;

public class Aula02OperadoresPorcentagem01 {
    public static void main(String[] args) {

        // % operador de porcentagem para saber se o resto do resultado é par ou impar.

        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = myObj.nextInt();

        int restoDadivisao = numero % 2;

        if (restoDadivisao == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("Número impar!");
        }


    }
}
