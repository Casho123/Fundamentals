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
            countries.get(country).putIfAbsent(city, 0);
            countries.get(country).put(city, countries.get(country).get(city) + population);
        }

        countries.entrySet().stream().sorted((c1,c2) -> {
            int result = Integer.compare(c2.getValue().values().stream().mapToInt(i -> i).sum(),
                    c1.getValue().values().stream().mapToInt(i -> i).sum());
            return result;

        })
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)\n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue().entrySet().stream()
                            .sorted((city1, city2) -> {
                                int res = Integer.compare(city2.getValue(), city1.getValue());
                                return res;
                            }).forEach(c -> System.out.printf("=>%s: %d\n", c.getKey(), c.getValue()));
                });




    }
}
