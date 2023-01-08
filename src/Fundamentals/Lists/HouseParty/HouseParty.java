package Fundamentals.Lists.HouseParty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> people = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            String name = elements[0];
            if (elements.length == 3) {
                if (!people.contains(name)) {
                    people.add(name);
                } else {
                    System.out.printf("%s is already in the list!\n", name);
                }
            } else if (elements.length == 4) {
                if (!people.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                } else {
                    people.remove(name);
                }
            }
        }

        for (String person : people) {
            System.out.println(person);

        }

    }
}
