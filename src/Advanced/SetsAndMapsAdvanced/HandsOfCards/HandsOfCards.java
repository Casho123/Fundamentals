package Advanced.SetsAndMapsAdvanced.HandsOfCards;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> players = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("JOKER")) {
                break;
            }
            String[] elements = input.split(":\\s+");
            String name = elements[0];
            List<String> cards = Arrays.stream(elements[1].split(",\\s+")).toList();
            players.putIfAbsent(name, new ArrayList<>());
            for (int i = 0; i < cards.size(); i++) {
                if (!players.get(name).contains(cards.get(i))) {
                    players.get(name).add(cards.get(i));
                }
            }
        }
        System.out.println();


    }
}
