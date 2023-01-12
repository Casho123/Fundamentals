package Advanced.SetsAndMapsAdvanced.SetsOfElements;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < numbers[0]; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            first.add(currentNum);
        }
        for (int i = 0; i < numbers[1]; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            second.add(currentNum);
        }
        for (Integer current : first) {
            if (second.contains(current)) {
                System.out.print(current + " ");
            }
        }


    }
}
