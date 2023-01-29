package OOP.WorkingWithAbstraction.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cardsSuits = scan.nextLine();
        System.out.println(cardsSuits + ":");

        CardSuits[] values = CardSuits.values();
        for (CardSuits value : values) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value.name());
        }



    }
}
