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

        for (int i = 0; i < items.length; i+=2) {
            String item = items[i];
            int quantity = Integer.parseInt(items[i+1]);




        }







    }
}
