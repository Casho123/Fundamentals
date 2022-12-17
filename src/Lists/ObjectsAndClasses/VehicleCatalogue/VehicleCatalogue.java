package Lists.ObjectsAndClasses.VehicleCatalogue;

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
        @Override
        public String toString() {
            return String.format("Type: %s\n Model: %s\n Color: %s\n Horsepower: %d",
                    type.toUpperCase().charAt(0) + type.substring(1), model, color, hp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




    }
}
