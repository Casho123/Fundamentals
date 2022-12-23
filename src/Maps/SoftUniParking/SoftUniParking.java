package Maps.SoftUniParking;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> cars = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");

            String command = elements[0];
            String user = elements[1];

            switch (command) {
                case "register":
                    String reg = elements[2];
                    if (!cars.containsKey(user)) {
                        cars.put(user, reg);
                        System.out.printf("%s registered %s successfully\n", user, reg);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n", cars.get(user));
                    }
                    break;
                case "unregister":
                    if (!cars.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        cars.remove(user);
                        System.out.printf("%s unregistered successfully\n", user);

                    }
                    break;
            }

        }
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());

        }
    }
}
