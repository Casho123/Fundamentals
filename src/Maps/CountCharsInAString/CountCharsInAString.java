package Maps.CountCharsInAString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().replace(" ", "");

        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!chars.containsKey(current)) {
                chars.put(current, 0);
            }
            chars.put(current, chars.get(current) + 1);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
