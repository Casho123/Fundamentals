package Arrays.Problem10;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] chest = scan.nextLine().split("\\|");

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Yohoho!")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i < elements.length ; i++) {
                        boolean isContained = false;
                        for (int j = 0; j < chest.length; j++) {
                            if (chest[j].equals(elements[i])) {
                                isContained = true;
                                break;
                            }
                        }
                        if (!isContained) {
                            String currentChest = elements[i] + " " + String.join(" ", chest);
                            chest = currentChest.split("\\s+");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(elements[1]);
                    if (index >= 0 && index < chest.length) {
                        String temp = chest[index];
                        for (int i = index; i < chest.length-1; i++) {
                            chest[i] = chest[i+1];
                        }
                        chest[chest.length-1] = temp;
                    }
                    break;
                case "Steal":

                    break;
            }

        }


    }
}
