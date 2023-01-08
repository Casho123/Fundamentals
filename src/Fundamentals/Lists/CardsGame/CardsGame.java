package Fundamentals.Lists.CardsGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while(true) {
            if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);

            } else if(first.get(0) < second.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
                first.remove(0);
                second.remove(0);
            } else {
                first.remove(0);
                second.remove(0);
            }
            if (first.size() == 0 || second.size() == 0) {
                break;
            }
        }
        int sum = 0;
        if (first.isEmpty()) {
            for (int i = 0; i < second.size(); i++) {
                sum += second.get(i);
            }
            System.out.printf("Second player wins! Sum: %d ", sum);
        } else if(second.isEmpty()) {
            for (int i = 0; i < first.size(); i++) {
                sum += first.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }
}
