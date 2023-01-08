package Fundamentals.Methods.MoreExercise.Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());
        double third = Double.parseDouble(scan.nextLine());
        double fourth = Double.parseDouble(scan.nextLine());

        getClosestPoint(first, second, third, fourth);




    }
    public static void getClosestPoint(double first, double second, double third, double fourth) {

        double firstResult = Math.max(Math.abs(first), Math.abs(second));
        double secondResult = Math.max(Math.abs(third), Math.abs(fourth));

        if (firstResult <= secondResult) {
            System.out.printf("(%.0f, %.0f)", first, second);
        } else {
            System.out.printf("(%.0f, %.0f)", third, fourth);
        }
    }
}
