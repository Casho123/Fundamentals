package Maps.MapsMoreExercise.MOBAChallenger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> players = new TreeMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Season end")) {

            }
            if (!input.contains("vs")) {
                String[] elements = input.split(" -> ");
                String player = elements[0];
                String position = elements[1];
                int skillPoints = Integer.parseInt(elements[2]);
                if (!players.containsKey(player)) {
                    players.put(player, new TreeMap<>());
                } else {
                    if (!players.get(player).containsKey(position)) {
                        players.get(player).put(position, skillPoints);
                    } else {
                        int currentPoints = players.get(player).get(position);
                        if (currentPoints < skillPoints) {
                            players.get(player).put(position, skillPoints);
                        }
                    }
                }

            } else {

            }
        }



    }
}
