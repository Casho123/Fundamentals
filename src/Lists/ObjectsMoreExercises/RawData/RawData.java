package Lists.ObjectsMoreExercises.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData {

    public static class Engine {

        private int speed;
        private int power;

        public Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        public int getSpeed() {
            return speed;
        }

        public int getPower() {
            return power;
        }
    }

    public static class Cargo {

        private int weight;
        private String type;

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }

        public int getWeight() {
            return weight;
        }

        public String getType() {
            return type;
        }
    }

    public static class Tire {

        private double pressure;
        private int age;

        public Tire(double pressure, int age) {
            this.pressure = pressure;
            this.age = age;
        }

        public double getPressure() {
            return pressure;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Car {

        private String model;
        private Engine engine;
        private Cargo cargo;
        private List<Tire> tires;

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public List<Tire> getTires() {
            return tires;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");

            String model = elements[0];
            int engineSpeed = Integer.parseInt(elements[1]);
            int enginePower = Integer.parseInt(elements[2]);

            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(elements[3]);
            String cargoType = elements[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();

            double tire1Pressure = Double.parseDouble(elements[5]);
            int tire1Age = Integer.parseInt(elements[6]);

            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            tires.add(tire1);

            double tire2Pressure = Double.parseDouble(elements[7]);
            int tire2Age = Integer.parseInt(elements[8]);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            tires.add(tire2);

            double tire3Pressure = Double.parseDouble(elements[9]);
            int tire3Age = Integer.parseInt(elements[10]);

            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            tires.add(tire3);

            double tire4Pressure = Double.parseDouble(elements[11]);
            int tire4Age = Integer.parseInt(elements[12]);

            Tire tire4 = new Tire(tire4Pressure, tire4Age);

            tires.add(tire4);

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }
        String cargoType = scan.nextLine();
        if (cargoType.equals("fragile")) {
            for (Car car : cars) {
                double pressure = 0;
                for (Tire tire : car.getTires()) {
                    pressure += tire.getPressure();
                }
                double avgPressure = pressure/4;
                if (avgPressure < 1) {
                    System.out.println(car.getModel());
                }

            }

        } else if(cargoType.equals("flamable")) {
            cars.stream().filter(c -> c.getEngine().getPower() > 250).forEach(c -> System.out.printf("%s\n", c.getModel()));
        }

    }
}
