package OOP.Inheritance.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Beast!")) {
                break;
            }
            String animalType = input;
            String[] animalArr = scan.nextLine().split("\\s+");
            Animal animal = null;
            try {
                switch (animalType) {
                    case "Cat":
                        animal = new Cat(animalArr[0], Integer.parseInt(animalArr[1]), animalArr[2]);
                        break;
                    case "Dog":
                        animal = new Dog(animalArr[0], Integer.parseInt(animalArr[1]), animalArr[2]);
                        break;
                    case "Frog":
                        animal = new Frog(animalArr[0], Integer.parseInt(animalArr[1]), animalArr[2]);
                        break;
                    case "Kitten":
                        animal = new Kitten(animalArr[0], Integer.parseInt(animalArr[1]));
                        break;
                    case "Tomcat":
                        animal = new Tomcat(animalArr[0], Integer.parseInt(animalArr[1]));
                        break;
                }
                animals.add(animal);

            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid input!");
            }
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }



    }
}
