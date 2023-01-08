package Fundamentals.Lists.MoreExercises.DrumSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        List<Integer> drums = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> powers = new ArrayList<>(drums);

        while(true) {
            String input = scan.nextLine();
            if (input.equals("Hit it again, Gabsy!")) {
                break;
            }
            int power = Integer.parseInt(input);

            for (int i = 0; i < drums.size(); i++) {
                drums.set(i, drums.get(i) - power);
            }


            for (int i = 0; i < drums.size(); i++) {
                if (drums.get(i) <= 0) {
                    double currentCost = powers.get(i) * 3;
                    if (money > currentCost) {
                        drums.set(i, powers.get(i));
                        money-= currentCost;
                    } else {
                        drums.remove(i);
                        powers.remove(i);
                    }
                }
            }
        }

        for (Integer drum : drums) {
            System.out.print(drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money);

    }
}
