package Teste;

import java.util.Scanner;

public class Aula3LoopFor {
    public static void main(String[] args) {

        // Loop For

        Scanner myobj = new Scanner(System.in);
        System.out.println("Digite uma contador:");

        int contador = myobj.nextInt();

        if (contador >= 10) {
            for (int i = 0; i < contador; i++) {
                System.out.println("Hello World!!");
            }
        } else if (contador == 0) {
            System.out.println("Reinicie o programa com valor maior que 0.");
        }




    }
}
