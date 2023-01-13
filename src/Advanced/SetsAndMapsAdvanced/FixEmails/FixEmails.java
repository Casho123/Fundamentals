package Advanced.SetsAndMapsAdvanced.FixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> people = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String email = scan.nextLine();
            if (!email.endsWith("com") && !email.endsWith("uk") && !email.endsWith("us")) {
                people.putIfAbsent(input, email);
            }
        }

        for (Map.Entry<String, String> entry : people.entrySet()) {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
        }


    }
}
