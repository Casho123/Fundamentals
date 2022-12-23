package Maps.CountCharsInAString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<Character, Integer> chars = new LinkedHashMap<>();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (current != ' ') {
                if (!chars.containsKey(current)) {
                    chars.put(current, 1);
                } else {
                    chars.put(current, chars.get(current) + 1);
                }


            }

        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
