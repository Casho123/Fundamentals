package Fundamentals.Maps.Orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> ordersQuantity = new LinkedHashMap<>();
        Map<String, Double> itemsPrice = new LinkedHashMap<>();


        while (true) {
            String input = scan.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String[] elements = input.split(" ");

            String item = elements[0];
            double price = Double.parseDouble(elements[1]);
            int quantity = Integer.parseInt(elements[2]);

            if (!ordersQuantity.containsKey(item)) {
                ordersQuantity.put(item, quantity);
            } else {
                ordersQuantity.put(item, ordersQuantity.get(item) + quantity);
            }
            itemsPrice.put(item, price);

        }
        for (Map.Entry<String, Integer> entry : ordersQuantity.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue() * itemsPrice.get(entry.getKey()));


        }
    }
}
