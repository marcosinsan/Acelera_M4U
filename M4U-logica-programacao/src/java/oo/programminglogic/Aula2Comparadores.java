package java.oo.logicadeprogramacao;

public class Aula2Comparadores {
    // < >  <= >=  ==  !=  pegar valores de comparação e dizer o que é o resultado

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;

        Boolean isDezMaiorQueVinte = numero1 > numero2;
        Boolean isDezMenorQueVinte = numero1 < numero2;
        Boolean isDezIgualVinte    = numero1 != numero2;
        Boolean isDezDiferenteDez  = numero1 == numero2;

        System.out.println("O valor " + numero1 + " > " + numero2 + " = "  + isDezMaiorQueVinte);
        System.out.println("O valor " + numero1 + " < " + numero2 + " = "  + isDezMenorQueVinte);
        System.out.println("O valor " + numero1 + " != " + numero2 + " = "  + isDezDiferenteDez);
        System.out.println("O valor " + numero1 + " == " + numero2 + " = "  + isDezIgualVinte);

    }
}
