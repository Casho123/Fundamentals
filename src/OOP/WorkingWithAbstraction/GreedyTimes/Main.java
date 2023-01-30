package OOP.WorkingWithAbstraction.GreedyTimes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scan.nextLine());
        String[] input = scan.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < input.length; i += 2) {
            String item = input[i];
            long quantity = Long.parseLong(input[i + 1]);

            if (item.length() == 3) {
                bag.addCash(item, quantity);
            } else if (item.toLowerCase().endsWith("gem")) {
                bag.addGems(item, quantity);

            } else if (item.toLowerCase().equals("gold")) {
                bag.addGold(quantity);
            }
        }
        bag.printContent();

    }

}
