package OOP.Polymorphism.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();



        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] animalArr = input.split("\\s+");
            String[] foodArr = scan.nextLine().split("\\s+");



            Food food = null;
            Animal animal = null;
            switch (foodArr[0]) {
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(foodArr[1]));
                    break;
                case "Meat":
                    food = new Meat(Integer.parseInt(foodArr[1]));
                    break;
            }

            switch (animalArr[0]) {
                case "Cat":
                    try {
                        animal = new Cat(animalArr[1], Double.parseDouble(animalArr[2]), animalArr[3], animalArr[4]);
                        animal.makeSound();
                        animal.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Tiger":
                    try {
                        animal = new Tiger(animalArr[1], Double.parseDouble(animalArr[2]), animalArr[3]);
                        animal.makeSound();
                        animal.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Mouse":
                    try {
                        animal = new Mouse(animalArr[1], Double.parseDouble(animalArr[2]), animalArr[3]);
                        animal.makeSound();
                        animal.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Zebra":
                    try {

                        animal = new Zebra(animalArr[1], Double.parseDouble(animalArr[2]), animalArr[3]);
                        animal.makeSound();
                        animal.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
            }
        }

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }


}

