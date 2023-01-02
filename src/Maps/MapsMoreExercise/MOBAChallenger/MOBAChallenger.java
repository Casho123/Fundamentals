package Maps.MapsMoreExercise.MOBAChallenger;

import java.util.*;

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
    public static boolean havePositionInCommon(Map<String, Map<String, Integer>> players, String p1, String p2) {
        List<String> p1Positions = new ArrayList<>();
        List<String> p2Positions = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> player : players.entrySet()) {
            if (player.getKey().equals(p1)) {
                for (Map.Entry<String, Integer> pos : player.getValue().entrySet()) {
                    p1Positions.add(pos.getKey());
                }
            } else if(player.getKey().equals(p2)) {
                for (Map.Entry<String, Integer> pos : player.getValue().entrySet()) {
                    p2Positions.add(pos.getKey());
                }
            }
        }
        return false;

    }
}
