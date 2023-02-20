package OOP.Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split("\\s+");
        String[] tokens = scan.nextLine().split("\\s+");
        int number = Integer.parseInt(scan.nextLine());
        Vehicle car = new Car(Double.parseDouble(elements[1]), Double.parseDouble(elements[2]), Double.parseDouble(elements[3]));
        Vehicle truck = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(elements[3]));

        for (int i = 0; i < number; i++) {
            String[] input = scan.nextLine().split("\\s+");
            switch (input[0]) {
                case "Drive":
                    if (input[1].equals("Car")) {
                        System.out.println(car.drive(Double.parseDouble(input[2])));

                    } else if (input[1].equals("Truck")) {
                        System.out.println(truck.drive(Double.parseDouble(input[2])));
                    }
                    break;
                case "Refuel":
                    if (input[1].equals("Car")) {
                        car.refuel(Double.parseDouble(input[2]));
                    } else if (input[1].equals("Truck")) {
                        truck.refuel(Double.parseDouble(input[2]));

                    }

                    break;
            }

        }
        System.out.println(car.toString());
        System.out.println(truck.toString());

    }
}
