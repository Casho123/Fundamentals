package OOP.Polymorphism.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal animal;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] animalDetails = input.split("\\s+");
            String type = animalDetails[0];
            String name = animalDetails[1];
            Double weight = Double.parseDouble(animalDetails[2]);
            String livingRegion = animalDetails[3];

            if (animalDetails.length == 5) {
                String breed = animalDetails[4];
                animal = new Cat(name, type, weight, livingRegion, breed);
                String[] foodArr = scan.nextLine().split("\\s+");
                Food food;
                if (foodArr[0].equals("Vegetable")) {
                    food = new Vegetable(Integer.parseInt(foodArr[1]));
                } else {
                    food = new Meat(Integer.parseInt(foodArr[1]));
                }
                animal.eatFood(food);

            } else {
                switch (type) {
                    case "Tiger":
                        break;
                    case "Zebra":
                        break;
                    case "Mouse":
                        break;

                }


            }
        }


    }
}
