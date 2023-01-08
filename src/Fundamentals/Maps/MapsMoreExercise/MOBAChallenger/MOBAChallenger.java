package Fundamentals.Maps.MapsMoreExercise.MOBAChallenger;

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
                    boolean hasCommon = false;
                    for (String s : players.get(playerOne).keySet()) {
                        for (String s1 : players.get(playerTwo).keySet()) {
                            if (s.equals(s1)) {
                                hasCommon = true;
                                break;
                            }
                        }
                    }
                    if (hasCommon) {
                        if (players.get(playerOne).values().stream().mapToInt(i -> i).sum() >
                                players.get(playerTwo).values().stream().mapToInt(i -> i).sum()) {
                            players.remove(playerTwo);
                        } else if (players.get(playerTwo).values().stream().mapToInt(i -> i).sum() <
                                players.get(playerOne).values().stream().mapToInt(i -> i).sum()) {
                            players.remove(playerOne);
                        }
                    }
                }
            }
        }
        players.entrySet().stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(),
                            p1.getValue().values().stream().mapToInt(i -> i).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill\n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue().entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int result = Integer.compare(e2.getValue(), e1.getValue());
                                if (result == 0) {
                                    result = e1.getKey().compareTo(e2.getKey());
                                }
                                return result;
                            }).forEach(e -> System.out.printf("- %s <::> %d\n", e.getKey(), e.getValue()));
                });

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
