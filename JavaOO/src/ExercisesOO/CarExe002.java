package ExercisesOO;

import introductionclass.classes.Car;

import java.util.Scanner;

public class CarExe002 {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();

        Scanner obj = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n (1) Carro do Futuro\n (2) Carro geração Z");

        byte option = obj.nextByte();
        System.out.println("Loading car data ....\n");

        switch (option) {

            case 1:
                car.name = "Carocha";
                car.model = "Volkswagen Typ 1";
                car.year = 1969;
                break;
            case 2:
                car2.name = "Corsa";
                car2.model = "Wind Champ";
                car2.year = 1999;
                break;
            default: String message = "Invade option: " + option;
        }

        if(option == 1){
            System.out.println("Name: " + car.name + " Model: " + car.model + " Year: " + car.year);
        } else if (option == 2){
            System.out.println("Name: " + car2.name + " Model: " + car2.model + " Year: " + car2.year);
        } else {
            System.out.println("ERRor: Invade option");
        }

        System.out.println("\nEnd");

    }
}
