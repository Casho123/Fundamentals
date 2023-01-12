package Advanced.SetsAndMapsAdvanced.PhoneBook;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> people = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("search")) {
                break;
            }
            String[] elements = input.split("-");
            String person = elements[0];
            String phone = elements[1];
            people.putIfAbsent(person, phone);
            people.put(person, phone);
        }
        while(true) {
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String name = input;
            if (!people.containsKey(name)) {
                System.out.printf("Contact %s does not exist.\n", name);
            } else {
                System.out.printf("%s -> %s\n", name, people.get(name));
            }
        }
    }
}
