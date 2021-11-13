package introductioninheritance;

public class TestaHeranca {

    public static void main(String[] args) {

        // Criando um obj carro.

        Carro mycarro = new Carro();

        mycarro.honk();

        System.out.println(mycarro.brand + " " + mycarro.nomeDoModelo);
    }
}
