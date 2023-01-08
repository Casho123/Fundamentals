package Fundamentals.Arrays.Problem1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            array[i] = number;
            sum+= number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
