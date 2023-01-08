package Fundamentals.DataTypesAndVariables.Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        if (people%capacity == 0) {
            System.out.println(people/capacity);
        } else {
            System.out.println(people/capacity + 1);
        }
    }
}
