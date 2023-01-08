package Fundamentals.DataTypesAndVariables.Problem4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char current = scan.nextLine().charAt(0);
            sum += current;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
