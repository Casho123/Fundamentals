package OOP.WorkingWithAbstraction.GreedyTimes;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());
        Map<String, Map<String,Integer>> stuff = new LinkedHashMap<>();


        String[] items = scan.nextLine().split("\\s+");
        double currentCapacity = 0;

        for (int i = 0; i < items.length; i+=2) {
            String item = items[i];
            int quantity = Integer.parseInt(items[i+1]);
            if (currentCapacity + quantity <= capacity) {
                if (item.equals("Gold")) {
                    stuff.putIfAbsent("Gold", new LinkedHashMap<>());
                    if (!stuff.get("Gold").containsKey("Gold")) {
                        stuff.get("Gold").put("Gold", quantity);
                    } else {
                        stuff.get("Gold").put("Gold", stuff.get("Gold").get("Gold") + quantity);
                    }
                }
                if (item.toLowerCase().endsWith("gem")) {
                    stuff.putIfAbsent("Gem", new LinkedHashMap<>());
                    if (!stuff.get("Gem").containsKey(item)) {
                        stuff.get("Gem").put(item, quantity);
                    } else {
                        stuff.get("Gem").put(item, stuff.get("Gem").get(item) + quantity);
                    }
                }



            }





        }
        System.out.println();







    }
}
