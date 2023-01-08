package Fundamentals.Methods.MoreExercise.Problem1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operation = scan.nextLine();
        String input = scan.nextLine();
        result(operation, input);
    }

    public static void result(String operation, String input) {
        switch (operation) {
            case "int":
                System.out.println(Integer.parseInt(input) * 2);
                break;
            case "real":
                System.out.printf("%.2f", Double.parseDouble(input) * 1.5);
                break;
            case "string":
                System.out.printf("$%s$", input);
                break;
        }
    }
}
