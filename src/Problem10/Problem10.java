package Problem10;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double totalExpenses = 0;
        int trashedKeyboard = 0;

        for (int i = 1; i <= lostGamesCount ; i++) {
            if (i %2 == 0) {
                totalExpenses += headsetPrice;
            }
            if (i % 3 == 0) {
                totalExpenses += mousePrice;
            }
            if (i % 6 == 0) {
                totalExpenses += keyboardPrice;
                trashedKeyboard++;
                if (trashedKeyboard % 2 == 0) {
                    totalExpenses += displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
