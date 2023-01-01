package Maps.MapsMoreExercise.Judge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        for (Map.Entry<String, Map<String, Integer>> entry : contests.entrySet()) {
            System.out.printf("%s: %d participants\n", entry.getKey(), entry.getValue().size());
            int counter = 1;
            for (Map.Entry<String, Integer> contestant : entry.getValue().entrySet()) {
                System.out.printf("%d. %s <::> %d\n", counter, contestant.getKey(), contestant.getValue());
                counter++;
            }

        }





    }
}
