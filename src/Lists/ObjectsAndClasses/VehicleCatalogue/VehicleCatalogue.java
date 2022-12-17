package Lists.ObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    public static class Vehicle {

        private String type;
        private String model;
        private String color;
        private int hp;

        public Vehicle(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getModel() {
            return model;
        }

        public String getType() {
            return type;
        }

        public int getHp() {
            return hp;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d",
                    type.toUpperCase().charAt(0) + type.substring(1), model, color, hp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String type = elements[0];
            String model = elements[1];
            String color = elements[2];
            int hp = Integer.parseInt(elements[3]);
            Vehicle vehicle = new Vehicle(type, model, color, hp);
            vehicles.add(vehicle);
        }

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Close the Catalogue")) {
                break;
            }
            vehicles.stream().filter(v -> v.getModel().equals(input)).forEach(System.out::println);
        }
        getAverage(vehicles);
    }
    public static void getAverage(List<Vehicle> vehicles) {
        double carsHp = 0;
        double trucksHp = 0;
        int counterCars = 0;
        int trucksCounter = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getType().equals("car")) {
                carsHp += vehicles.get(i).getHp();
                counterCars++;
            } else if(vehicles.get(i).getType().equals("truck")) {
                trucksHp += vehicles.get(i).getHp();
                trucksCounter++;
            }
        }
        if (counterCars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsHp/counterCars);
        }
        if (trucksCounter == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksHp/trucksCounter);
        }

    }
}
