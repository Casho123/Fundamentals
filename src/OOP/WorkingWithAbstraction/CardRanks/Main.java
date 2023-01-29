package OOP.WorkingWithAbstraction.CardRanks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(input + ":");
        CardRanks[] ranks = CardRanks.values();
        for (CardRanks rank : ranks) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", rank.ordinal(), rank.name());
        }
    }
}
