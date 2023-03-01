package OOP.Polymorphism.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] animalDetails = input.split("\\s+");
            Animal animal;

            if (animalDetails.length == 5) {
                String type = animalDetails[0];
                String name = animalDetails[1];
                Double weight = Double.parseDouble(animalDetails[2]);
                String livingRegion = animalDetails[3];
                String breed = animalDetails[4];
                animal = new Cat(name, type, weight, livingRegion, breed);

            } else {

            }
        }


    }
}
