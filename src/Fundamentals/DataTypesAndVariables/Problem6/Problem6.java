package Fundamentals.DataTypesAndVariables.Problem6;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 97; i < n + 97; i++) {
            for (int j = 97; j < n + 97; j++) {
                for (int k = 97; k < n + 97; k++) {
                    System.out.println((char)i + "" + (char)j + "" + (char)k + "");
                }
            }

        }
    }
}
