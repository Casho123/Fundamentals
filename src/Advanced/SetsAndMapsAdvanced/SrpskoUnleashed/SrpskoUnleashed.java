package Advanced.SetsAndMapsAdvanced.SrpskoUnleashed;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SrpskoUnleashed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> venues = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            if (input.contains(" @")) {
                String[] elements = input.split(" @");
                String singer = elements[0];
                String[] tokens = elements[1].split(" ");
                String venue = "";
                int ticketCost = 0;
                int tickets = 0;
                if (tokens.length == 3) {
                    venue = tokens[0];
                    ticketCost = Integer.parseInt(tokens[1]);
                    tickets = Integer.parseInt(tokens[2]);
                } else if(tokens.length == 4) {
                    venue = tokens[0] + " " + tokens[1];
                    ticketCost = Integer.parseInt(tokens[2]);
                    tickets = Integer.parseInt(tokens[3]);
                } else if (tokens.length == 5) {
                    venue = tokens[0] + " " + tokens[1] + " " + tokens[2];
                    ticketCost = Integer.parseInt(tokens[3]);
                    tickets = Integer.parseInt(tokens[4]);
                }
                venues.putIfAbsent(venue, new LinkedHashMap<>());
                venues.get(venue).putIfAbsent(singer, 0);
                venues.get(venue).put(singer, venues.get(venue).get(singer) + ticketCost * tickets);
            }
        }
        for (Map.Entry<String, Map<String, Integer>> entry : venues.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream()
                    .sorted((v1,v2) -> {
                        int result = Integer.compare(v2.getValue(), v1.getValue());
                        return result;
                    }).forEach(s -> System.out.printf("#  %s -> %d\n", s.getKey(), s.getValue()));
        }


    }
}
