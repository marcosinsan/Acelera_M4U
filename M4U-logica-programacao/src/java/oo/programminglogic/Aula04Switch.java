package java.oo.programminglogic;

public class Aula04Switch {
    public static void main(String[] args) {

       // Switch
        byte dia = 3;

        String pratoDoDia;

        switch (dia) {

            case 1: pratoDoDia = "Bife a Cavalo.";
                break;

            case 2: pratoDoDia = "Tradicional do povo.";
                break;

            case 3: pratoDoDia = "Feijoada do Juca.";
            break;

            case 4: pratoDoDia = "Virada Paulista.";
            break;

            case 5: pratoDoDia = "Dogão com Coca Cola";
            break;

            default: pratoDoDia = "Opção não existe!!";

        }

        System.out.println(pratoDoDia);
    }
}
