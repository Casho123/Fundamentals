package Fundamentals.Methods.Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        printResult(first, second);
    }

    public static void printResult(char a, char b) {
        if (a < b) {
            for (char i = (char)(a + 1); i < b ; i++) {
                System.out.print(i + " ");
            }
        } else if (a > b) {
            for (char i = (char)(b + 1); i < a ; i++) {
                System.out.print(i + " ");

            }
        }


    }
}
