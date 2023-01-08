package Fundamentals.DataTypesAndVariables.Problem5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
            char current = (char)i;
            System.out.print(current + " ");

        }
    }
}
