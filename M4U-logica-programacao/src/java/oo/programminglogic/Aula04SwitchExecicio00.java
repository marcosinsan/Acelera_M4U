package java.oo.programminglogic;

public class Aula04SwitchExecicio00 {

    public static void main(String[] args) {

        byte mes = 6;

        String mesString;

        switch (mes) {

            case 1: mesString = "Janeiro";
                break;

            case 2: mesString = "Fevered";
                break;

            case 3: mesString = "Março";
                break;

            case 4: mesString = "April";
                break;

            case 5: mesString = "Maio";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + mes);
        }

        System.out.println("O mês escolhido é: " + mesString);

    }
}
