package Fundamentals.Lists.MoreExercises.CarRace;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        double timeOne = 0;
        double timeTwo = 0;

        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) == 0) {
                timeOne *= 0.8;
            } else {
                timeOne += list.get(i);
            }
        }
        for (int i = list.size()-1; i > list.size()/2 ; i--) {
            if (list.get(i) == 0) {
                timeTwo *= 0.8;
            } else {
                timeTwo += list.get(i);
            }
        }
        if (timeOne < timeTwo) {
            System.out.printf("The winner is left with total time: %.1f", timeOne);
        } else if (timeTwo < timeOne) {
            System.out.printf("The winner is right with total time: %.1f", timeTwo);
        }



    }
}
