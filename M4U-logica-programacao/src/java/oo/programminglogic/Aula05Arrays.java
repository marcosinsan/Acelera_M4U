package java.oo.programminglogic;

public class Aula05Arrays {

    public static void main(String[] args) {

        // Criando uma arrays

        String[] nomes = new String[5];

        nomes[0] = "Marco";
        nomes[1] = "Anne";
        nomes[2] = "Fulano";
        nomes[3] = "siclano";
        nomes[4] = "João";

        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);
        System.out.println(nomes[0]);

        int[] anArray = {
                10, 20, 30,
                100, 200, 300
        };

        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

    }
}
