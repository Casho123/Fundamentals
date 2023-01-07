package TextProcessing.TextProcessingMoreExercise.TreasureFinder;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while(true) {
            String message = scan.nextLine();
            if (message.equals("find")) {
                break;
            }
            String decryptedMessage = "";
            int keyIndex = 0;
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                int keyNum = numbers[keyIndex];
                int decryptedChar = c - keyNum;
                decryptedMessage += (char) decryptedChar;

                keyIndex++;
                if (keyIndex == numbers.length) {
                    keyIndex = 0;
                }
            }

            int ampersandIndexOne = decryptedMessage.indexOf("&");
            int ampersandIndexTwo = decryptedMessage.lastIndexOf("&");
            String type = decryptedMessage.substring(ampersandIndexOne + 1, ampersandIndexTwo);

            int coordinatesIndexOne = decryptedMessage.indexOf("<");
            int coordinatesIndexTwo = decryptedMessage.indexOf(">");
            String coordinates = decryptedMessage.substring(coordinatesIndexOne + 1, coordinatesIndexTwo);

            System.out.printf("Found %s at %s\n", type, coordinates);

        }

    }
}
