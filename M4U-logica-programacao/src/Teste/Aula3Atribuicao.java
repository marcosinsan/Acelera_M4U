package Teste;

public class Aula3Atribuicao {

    // Atribuição += -= *= /= %=

    public static void main(String[] args) {

        double bonus = 1800;
        bonus += 1000;

        System.out.println("O valor do contador é " + bonus);

        int contador = 10;
        contador -= 5;
        contador ++;

        System.out.println("O valor do contador é: " + contador);

        double salario = 1000;
        salario *= 5;
        salario /= 2;

        if (salario != 1500) {
            System.out.println("Você ganha mais de um salário mínimo, Salário = " + salario);
        }
        else {
            System.out.println("O valor do salário é: " + salario);
        }

        int numero = 5;
        numero ++;
        numero -= 3;
        numero %= 3;

        System.out.println("O valor do número é: " + numero);


    }
}
