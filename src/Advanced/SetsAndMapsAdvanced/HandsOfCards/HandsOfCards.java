package Advanced.SetsAndMapsAdvanced.HandsOfCards;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> players = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("JOKER")) {
                break;
            }
            String[] elements = input.split(":\\s+");
            String name = elements[0];
            List<String> cards = Arrays.stream(elements[1].split(",\\s+")).collect(Collectors.toList());
            players.putIfAbsent(name, new ArrayList<>());
            for (int i = 0; i < cards.size(); i++) {
                if (!players.get(name).contains(cards.get(i))) {
                    players.get(name).add(cards.get(i));
                }
            }
        }

        for (Map.Entry<String, List<String>> entry : players.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), calculateTotalValueOfCards(entry.getValue()));
        }
    }

    public static int calculateTotalValueOfCards(List<String> cards) {
        int result = 0;
        for (String card : cards) {
            result += getCurrentValue(card);
        }

        return result;
    }

    public static int getCurrentValue(String current) {
        int value = 0;
        String type = current.charAt(current.length() - 1) + "";
        if (current.length() == 3) {
            value = 10 * getMultiplier(type);

        } else {
            if (Character.isDigit(current.charAt(0))) {
                String firstChar = current.charAt(0) + "";
                value = Integer.parseInt(firstChar) * getMultiplier(type);
            } else {
                String letter = current.charAt(0) + "";
                if (letter.equals("J")) {
                    value = 11 * getMultiplier(type);
                } else if (letter.equals("Q")) {
                    value = 12 * getMultiplier(type);
                } else if (letter.equals("K")) {
                    value = 13 * getMultiplier(type);
                } else if (letter.equals("A")) {
                    value = 14 * getMultiplier(type);
                }
            }
        }
        return value;
    }
    public static int getMultiplier(String type) {
        int multiplier = 0;
        switch (type) {
            case "C":
                multiplier = 1;
                break;
            case "D":
                multiplier = 2;
                break;
            case "H":
                multiplier = 3;
                break;
            case "S":
                multiplier = 4;
                break;
        }
        return multiplier;
    }

}
