package Fundamentals.Maps.MapsMoreExercise.Judge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("no more time")) {
                break;
            }
            String[] elements = input.split(" -> ");
            String participant = elements[0];
            String contest = elements[1];
            int points = Integer.parseInt(elements[2]);

            if (!contests.containsKey(contest)) {
                contests.put(contest, new TreeMap<>());
            }
            if (!contests.get(contest).containsKey(participant)) {
                contests.get(contest).put(participant, points);
            } else {
                int currentPoints = contests.get(contest).get(participant);
                if (currentPoints < points) {
                    contests.get(contest).put(participant, points);
                }
            }

        }
        AtomicInteger num = new AtomicInteger(1);

        contests.entrySet().stream().forEach(e -> {
            num.set(1);
            System.out.println(e.getKey() + ": " + e.getValue().size() + " participants");
            e.getValue().entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());

                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
            });
        });

        Map<String, Integer> standings = new LinkedHashMap<>();

        for(Map.Entry<String, Map<String, Integer>> contest : contests.entrySet()) {
            for (Map.Entry<String, Integer> value : contest.getValue().entrySet()) {
                standings.putIfAbsent(value.getKey(), 0);
                standings.put(value.getKey(), standings.get(value.getKey()) + value.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;

        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });


    }
}
