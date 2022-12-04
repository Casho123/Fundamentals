package Methods.Problem4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        if (isBetween6and10Chars(password) && isMadeOfLettersAndDigits(password) && has2Digits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isBetween6and10Chars(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isMadeOfLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!has2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }

    }

    private static boolean isBetween6and10Chars(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean isMadeOfLettersAndDigits(String password) {
        boolean isValid = true;
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if (!Character.isDigit(current) && !Character.isLetter(current)) {
                isValid = false;
                break;
            }

        }
        return isValid;
    }

    private static boolean has2Digits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if (Character.isDigit(current)) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
