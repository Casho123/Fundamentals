package Advanced.DefiningClasses.SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            String model = elements[0];
            double fuelAmount = Double.parseDouble(elements[1]);
            double fuelCostPerKm = Double.parseDouble(elements[2]);
            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            cars.add(car);
        }
        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String model = elements[1];
            int distance = Integer.parseInt(elements[2]);
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getModel().equals(model)) {
                    cars.get(i).drive(distance);
                    break;
                }

            }
        }
        for (Car car : cars) {
            System.out.printf("%s %.2f %d\n", car.getModel(), car.getFuelAmount(), car.getDistanceTravelled());

        }




    }
}
