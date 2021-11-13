package java.oo.programminglogic;

import java.util.Scanner;

public class Aula3IfElse {

    // Trabalhando com if / else

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Qual seu name?");
        String nome = obj.nextLine();

        System.out.println("Olá," + nome);

        System.out.println("Escolha entre as opções:\n (1) mensagem especial\n (2) Uma mensagem supresa");
        int opcaoUser = obj.nextInt();

        if (opcaoUser == 1) {
            System.out.println("Sejam bem-vindos ao Mundo da Programação em Java!!");
        } else if (opcaoUser == 2) {
            for (int i = 0; i < nome.length(); i++) {
                System.out.println("Hello, World!!");
            }
        }
    }
}
