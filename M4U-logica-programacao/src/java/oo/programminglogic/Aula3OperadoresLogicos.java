package java.oo.logicadeprogramacao;

import java.util.Scanner;

public class Aula3OperadoresLogicos {

    //============Operadores Lógicos===========//

    // And (&&) e Or (||)

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = myobj.nextInt();

        System.out.println("Qual seu sálario atual:");
        String cnh = myobj.nextLine();

        if ((idade >= 18) && (cnh.equals("sim"))){
            System.out.println("Habilitado");
        }




    }
}
