import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        // Crindo obj para indentificar a entrada do usuario.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Olá, Qual seu nome?");

        String nome = myObj.nextLine();
        System.out.printf("Oi, %s", nome);

        String sobrenome;

        System.out.printf("E o seu sobrenome?\n");
        sobrenome = myObj.nextLine();

        System.out.printf("Seu nome completo é %s %s", nome, sobrenome);

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("\nSeja Bem-Vindo " + nomeCompleto);

        //===============================//================================//
        /*
        * TIPOS DE DADOS
        *
        * boolean boo = false || true;
        * char caractere = "c";
        *
        * INTEIROS
        *
        * byte umByte = 1;
        * short meioInteiro = 1231;
        * int inteiro = 788485993;
        * long dobroInteiro = 647483982992;
        *
        * REAIS
        *
        * float numeroReal = 0.1f;
        * double dobroNumeroReal = 1.5;
        *
        * CONSTANTE
        *
        * final int varConstante = "Não pode ser alterada."
        *
        * */
        //======================================//============================//

        /* TRABALHANDO COM OPERADORES E
        *
        * SOMA = +
        * SUBTRAÇÃO = -
        * MULTIPLICAÇÃO = *
        * DIVISÃO = /
        * RESTO DA DIVISÃO = %
        *
        *  */

        // variáveis que recebe um numero.
        int n1 = 6;
        int n2 = 9;

        //SOMA

        int soma = n1 + n2;
        System.out.println();
    }
}
