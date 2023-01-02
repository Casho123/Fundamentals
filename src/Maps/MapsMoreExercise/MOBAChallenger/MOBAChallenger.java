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

                break;
            }
            if (!input.contains("vs")) {
                String[] elements = input.split(" -> ");
                String player = elements[0];
                String position = elements[1];
                int skillPoints = Integer.parseInt(elements[2]);
                if (!players.containsKey(player)) {
                    players.put(player, new TreeMap<>());
                    players.get(player).put(position, skillPoints);
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
                String[] elements = input.split(" vs ");
                String playerOne = elements[0];
                String playerTwo = elements[1];
                if (playersExist(players, playerOne, playerTwo)) {

                }



            }
        }
        System.out.println();

    }
    public static boolean playersExist(Map<String, Map<String, Integer>> players, String playerOne, String playerTwo) {
        boolean p1Exists = false;
        boolean p2Exists = false;
        for (Map.Entry<String, Map<String, Integer>> player : players.entrySet()) {
            if (player.getKey().equals(playerOne)) {
                p1Exists = true;
            }
            if (player.getKey().equals(playerTwo)) {
                p2Exists = true;
            }
        }
        return p1Exists && p2Exists;

    }
}
