package Fundamentals.Lists.ObjectsMoreExercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSalesman {

    public static class Engine {

        private String model;
        private int power;
        private String displacement;
        private String efficiency;

        public Engine(String model, int power, String displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }
    }

    public static class Car {

        private String model;
        private Engine engine;
        private String weight;
        private String color;

        public Car(String model, Engine engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public String getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            Engine engine = null;
            String engineModel = elements[0];
            int enginePower = Integer.parseInt(elements[1]);
            if (elements.length == 4) {
                String engineDisplacement = elements[2];
                String engineEfficiency = elements[3];
                engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);

            } else if (elements.length == 3) {
                String third = elements[2];
                if (Character.isDigit(third.charAt(third.length()-1))) {
                    engine = new Engine(engineModel, enginePower, third, "n/a");
                } else {
                    engine = new Engine(engineModel, enginePower, "n/a", third);
                }
            } else if(elements.length == 2) {
                engine = new Engine(engineModel, enginePower, "n/a", "n/a");
            }

            engines.add(engine);
        }

        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            String[] elements = scan.nextLine().split("\\s+");

            Car car = null;

            String carModel = elements[0];
            String engineModel = elements[1];
            Engine engine = null;
            for (int j = 0; j < engines.size(); j++) {
                if (engines.get(j).getModel().equals(engineModel)) {
                    engine = engines.get(j);
                    break;
                }
            }
            if (elements.length == 4) {
                car = new Car(carModel, engine, elements[2], elements[3]);

            } else if(elements.length == 2) {
                car = new Car(carModel, engine, "n/a", "n/a");
            } else if(elements.length == 3) {
                String thirdElement = elements[2];
                if (Character.isDigit(thirdElement.charAt(thirdElement.length()-1))) {
                    car = new Car(carModel, engine, thirdElement, "n/a");
                } else {
                    car = new Car(carModel, engine, "n/a", thirdElement);
                }
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println("  " + car.getEngine().getModel() +":");
            System.out.println("\tPower: " + car.getEngine().getPower());
            System.out.println("\tDisplacement: " + car.getEngine().getDisplacement());
            System.out.println("\tEfficiency: " + car.getEngine().getEfficiency());
            System.out.println("  Weight: "+ car.getWeight());
            System.out.println("  Color: " + car.getColor());


        }


    }
}
