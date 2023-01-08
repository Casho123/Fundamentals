package Fundamentals.Lists.BombNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int number = array[0];
        int power = array[1];
        int sum = 0;

        while (numbers.contains(number)) {
            int numberIndex = numbers.indexOf(number);
            int leftIndex = Math.max(numberIndex-power, 0);
            int rightIndex = Math.min(numberIndex+power, numbers.size()-1);

            for (int i = leftIndex; i <= rightIndex; i++) {
                numbers.set(i, 0);


            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum+= numbers.get(i);

        }
        System.out.println(sum);
    }
}
