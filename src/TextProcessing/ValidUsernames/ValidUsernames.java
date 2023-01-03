package TextProcessing.ValidUsernames;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(", ");

        for (String element : elements) {
            if (isValid(element)) {
                System.out.println(element);
            }


        }
    }
    public static boolean isValid(String element) {
        boolean hasLength = element.length() >= 3 && element.length() <= 16;
        boolean isCharValid = true;
        for (int i = 0; i < element.length(); i++) {
            if (!Character.isDigit(element.charAt(i)) && !Character.isLetter(element.charAt(i))
                    && element.charAt(i) != '-' && element.charAt(i) != '_') {
                isCharValid = false;

            }
        }

        return hasLength && isCharValid;

    }
}
