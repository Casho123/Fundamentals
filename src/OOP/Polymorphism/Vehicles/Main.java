package OOP.Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vehicle car = new Car(0, 0, 0);
        Vehicle truck = new Truck(0, 0, 0);
        Vehicle bus = new Bus(0, 0, 0);

        for (int i = 0; i < 3; i++) {
            String[] vehicleInfo = scan.nextLine().split("\\s+");
            String vehicleType = vehicleInfo[0];
            double fuelQuantity = Double.parseDouble(vehicleInfo[1]);
            double fuelConsumption = Double.parseDouble(vehicleInfo[2]);
            double tankCapacity = Double.parseDouble(vehicleInfo[3]);

            switch (vehicleType) {
                case "Car":
                    car.setFuelQuantity(fuelQuantity);
                    car.setFuelConsumption(fuelConsumption);
                    car.setTankCapacity(tankCapacity);
                    break;
                case "Truck":
                    truck.setFuelQuantity(fuelQuantity);
                    truck.setFuelConsumption(fuelConsumption);
                    truck.setTankCapacity(tankCapacity);
                    break;
                case "Bus":
                    bus.setFuelQuantity(fuelQuantity);
                    bus.setFuelConsumption(fuelConsumption);
                    bus.setTankCapacity(tankCapacity);
                    break;
            }

        }

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");

            switch (elements[0]) {
                case "Drive":
                    String vehicle = elements[1];
                    double distance = Double.parseDouble(elements[2]);
                    if (vehicle.equals("Car")) {
                        car.drive(distance);
                    } else if (vehicle.equals("Truck")) {
                        truck.drive(distance);
                    } else if (vehicle.equals("Bus")) {
                        bus.drive(distance);
                    }
                    break;
                case "Refuel":
                    vehicle = elements[1];
                    double quantity = Double.parseDouble(elements[2]);
                    if (vehicle.equals("Car")) {
                        try {
                            car.refuel(quantity);
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                    } else if (vehicle.equals("Truck")) {
                        try {
                            truck.refuel(quantity);
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                    } else if (vehicle.equals("Bus")) {
                        try {
                            bus.refuel(quantity);
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                    }
                    break;
                case "DriveEmpty":
                    bus.setFuelConsumption(bus.getFuelConsumption() - 1.4);
                    try {
                        bus.drive(Double.parseDouble(elements[2]));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

    }
}
