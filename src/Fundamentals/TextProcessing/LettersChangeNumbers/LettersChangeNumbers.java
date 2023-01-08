package Fundamentals.TextProcessing.LettersChangeNumbers;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            int position = 0;

            char firstLetter = input[i].charAt(0);
            char lastLetter = input[i].charAt(input[i].length() - 1);
            int number = Integer.parseInt(input[i].substring(1, input[i].length() - 1));
            if (Character.isUpperCase(firstLetter)) {
                position = firstLetter - 64;
                sum += 1.0 * number / position;
            } else if (Character.isLowerCase(firstLetter)) {
                position = firstLetter - 96;
                sum += 1.0 * number * position;
            }
            if (Character.isUpperCase(lastLetter)) {
                position = lastLetter - 64;
                sum -= position;
            } else if (Character.isLowerCase(lastLetter)) {
                position = lastLetter - 96;
                sum += position;
            }

        }
        System.out.printf("%.2f", sum);


    }
}
