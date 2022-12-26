package Maps.ForceUsers;

import java.util.*;

public class ForceUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>>  sides = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }
            if (input.contains("|")) {
                String[] elements = input.split(" \\| ");
                String side = elements[0];
                String user = elements[1];
                if (!sides.containsKey(side)) {
                    sides.put(side, new ArrayList<>());
                }
                if (!hasUser(sides, user)) {
                    sides.get(side).add(user);
                }

            } else if(input.contains("->")) {
                String[] elements = input.split(" -> ");
                String user = elements[0];
                String side = elements[1];
                if (!sides.containsKey(side)) {
                    sides.put(side, new ArrayList<>());
                }
                if (hasUser(sides, user)) {
                    removeUser(sides, user);

                }
                sides.get(side).add(user);
                System.out.printf("%s joins the %s side!\n", user, side);
            }
        }
        for (Map.Entry<String, List<String>> side : sides.entrySet()) {
            if (side.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d\n", side.getKey(), side.getValue().size());
                for (String user : side.getValue()) {
                    System.out.println("! " + user);

                }
            }

        }
    }

    public static boolean hasUser(Map<String, List<String>> sides, String user) {
        boolean hasUser = false;
        for (Map.Entry<String, List<String>> side : sides.entrySet()) {
            for (int i = 0; i < side.getValue().size(); i++) {
                if (side.getValue().get(i).equals(user)) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void removeUser(Map<String, List<String>> sides, String user) {
        boolean isRemoved = false;
        for (Map.Entry<String, List<String>> entry : sides.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).equals(user)) {
                    entry.getValue().remove(i);
                    isRemoved = true;
                    break;
                }
                if (isRemoved) {
                    break;
                }

            }


        }
    }
}
