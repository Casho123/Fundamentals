package Maps.MapsMoreExercise.Snowwhite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> dwarves = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Once upon a time")) {
                break;
            }
            String[] elements = input.split(" <:> ");
            String name = elements[0];
            String hat = elements[1];
            int physics = Integer.parseInt(elements[2]);
            dwarves.putIfAbsent(hat, new LinkedHashMap<>());
            dwarves.get(hat).putIfAbsent(name, physics);

            if (dwarves.get(hat).get(name) < physics) {
                dwarves.get(hat).put(name, physics);
            }
        }
        Map<String, Integer> print = new LinkedHashMap<>();

        for(Map.Entry<String, Map<String, Integer>> entry : dwarves.entrySet()) {
            for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + subEntry.getKey() + " " + entry.getValue().size(), subEntry.getValue());
            }
        }
        print.entrySet().stream().sorted((pair2, pair1) -> {
            int sort = Integer.compare(pair1.getValue(), pair2.getValue());
            if (sort == 0) {
                String[] sort1 = pair1.getKey().split(" ");
                String[] sort2 = pair2.getKey().split(" ");
                sort = sort1[2].compareTo(sort2[2]);
            }
            return sort;
        }).forEach(pair -> {
            String[] printing = pair.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d\n", printing[0], printing[1], pair.getValue());
        });
    }
}
