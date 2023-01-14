package Advanced.SetsAndMapsAdvanced.PopulationCounter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> countries = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();

            if (input.equals("report")) {
                break;
            }

            String[] elements = input.split("\\|");
            String city = elements[0];
            String country = elements[1];
            int population = Integer.parseInt(elements[2]);

            countries.putIfAbsent(country, new LinkedHashMap<>());
        }

    }
}
