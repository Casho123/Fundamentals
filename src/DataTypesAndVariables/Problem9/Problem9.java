package DataTypesAndVariables.Problem9;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yield = Integer.parseInt(scan.nextLine());

        int days = 0;
        int totalAmount = 0;

        while(true) {
            if (yield < 100) {
                if (totalAmount >= 26) {
                    totalAmount -= 26;
                } else {
                    totalAmount-= totalAmount;
                }
                break;

            }
            days++;
            totalAmount += yield;
            yield-= 10;
            if (totalAmount >= 26) {
                totalAmount -= 26;
            } else {
                totalAmount-= totalAmount;
            }
        }
        System.out.println(days);
        System.out.println(totalAmount);


    }
}
