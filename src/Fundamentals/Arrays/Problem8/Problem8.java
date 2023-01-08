package Fundamentals.Arrays.Problem8;

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());




        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                    break;
                }
            }
        }
    }
}
