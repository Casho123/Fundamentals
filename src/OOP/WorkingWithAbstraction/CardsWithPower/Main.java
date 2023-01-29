package OOP.WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();
        Card card = new Card(Rank.valueOf(rank), Suit.valueOf(suit));
        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, card.getPower());

    }
}
