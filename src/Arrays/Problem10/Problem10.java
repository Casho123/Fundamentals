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
                    int count = Integer.parseInt(elements[1]);
                    if (count >= chest.length) {
                        for (int i = 0; i < chest.length; i++) {
                            if (i < chest.length-1) {
                                System.out.print(chest[i] + ", ");
                            } else {
                                System.out.println(chest[i]);
                            }
                            chest[i] = "";
                        }
                    } else {
                        for (int i = chest.length-count; i < chest.length ; i++) {
                            if (i < chest.length-1) {
                                System.out.print(chest[i] + ", ");
                            } else {
                                System.out.println(chest[i]);
                            }
                            chest[i] = "";

                        }
                    }
                    String currentChest = String.join(" ", chest);
                    chest = currentChest.split("\\s+");
                    break;
            }
        }

        String itemsLength = String.join("", chest);
        if (chest.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageLoot = 1.0 * itemsLength.length()/chest.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageLoot);

        }
    }
}
