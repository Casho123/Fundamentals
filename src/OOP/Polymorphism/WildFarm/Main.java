package OOP.Polymorphism.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        String input = scan.nextLine();

        while (!("End".equals(input))) {
            String inputFood = scan.next();

            String[] tokensFood = inputFood.split(" ");
            String[] tokensAnimal = input.split(" ");
            Food food = null;
            Animal animal = null;
            switch (tokensFood[0]) {
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(tokensFood[1]));
                    break;
                case "Meat":
                    food = new Meat(Integer.parseInt(tokensFood[1]));
                    break;
            }

            switch (tokensAnimal[0]) {
                case "Cat":
                    try{
                        animal = new Cat(tokensAnimal[1], Double.parseDouble(tokensAnimal[2]), tokensAnimal[3], tokensAnimal[4]);
                        animal.makeSound();
                        animal.eat(food);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Tiger":
                    try{
                        animal = new Tiger(tokensAnimal[1], Double.parseDouble(tokensAnimal[2]), tokensAnimal[3]);
                        animal.makeSound();
                        animal.eat(food);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Mouse":
                    try {
                        animal = new Mouse(tokensAnimal[1], Double.parseDouble(tokensAnimal[2]), tokensAnimal[3]);
                        animal.makeSound();
                        animal.eat(food);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
                case "Zebra":
                    try {

                        animal = new Zebra(tokensAnimal[1], Double.parseDouble(tokensAnimal[2]), tokensAnimal[3]);
                        animal.makeSound();
                        animal.eat(food);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    animalList.add(animal);
                    break;
            }
            input = scan.nextLine();
        }

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }


    }
}
