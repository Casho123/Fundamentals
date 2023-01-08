package Fundamentals.TextProcessing.MultiplyBigNumber;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bigNum = scan.nextLine().replaceFirst("^0+(?!$)", "");
        int multipleNum = Integer.parseInt(scan.nextLine());
        StringBuilder finalNum = new StringBuilder();

        int decimalRemainder = 0;
        if (bigNum.isEmpty()){
            bigNum = "0";
        }
        if (multipleNum == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int num = (int) bigNum.charAt(i) - 48;
            int currentSum = num * multipleNum;
            currentSum += decimalRemainder;
            finalNum.append(currentSum % 10);
            decimalRemainder = currentSum / 10;
        }

        if (decimalRemainder > 0) {
            finalNum.append(decimalRemainder);
        }

        System.out.println(finalNum.reverse());

    }
}
