package OOP.Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Pizza pizza = new Pizza(input[1], Integer.parseInt(input[2]));
        String[] arrDough = scan.nextLine().split("\\s+");
        Dough dough = new Dough(arrDough[1], arrDough[2], Double.parseDouble(arrDough[3]));
        pizza.setDough(dough);

        while (true) {
            String current = scan.nextLine();
            if (current.equals("END")) {
                break;
            }
            String[] toppingArr = current.split("\\s+");
            String toppingType = toppingArr[1];
            double toppingWeight = Double.parseDouble(toppingArr[2]);
            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);
        }
        System.out.printf("%s - %.2f",pizza.getName(), pizza.getOverallCalories() );



    }
}
